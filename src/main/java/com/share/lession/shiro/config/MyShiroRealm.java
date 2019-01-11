package com.share.lession.shiro.config;

import com.share.lession.shiro.vo.SysPermission;
import com.share.lession.shiro.vo.SysRole;
import com.share.lession.shiro.vo.SysUser;
import com.share.lession.shiro.vo.UserInfo;
import com.share.lession.shiro.service.SysPermissionService;
import com.share.lession.shiro.service.SysRoleService;
import com.share.lession.shiro.service.UserInfoService;
import com.share.lession.util.PasswordHelper;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/11.
 * 自定义权限匹配和账号密码匹配
 */
public class MyShiroRealm extends AuthorizingRealm {
    @Resource
    private SysRoleService sysRoleService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Resource
    private SysPermissionService sysPermissionService;
    //用户登录次数计数  redisKey 前缀
    private String SHIRO_LOGIN_COUNT = "shiro_login_count_";

    //用户登录是否被锁定    一小时 redisKey 前缀
    private String SHIRO_IS_LOCK = "shiro_is_lock_";
    @Resource
    private UserInfoService userInfoService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserInfo userInfo = (UserInfo) principals.getPrimaryPrincipal();
        try {
            List<SysRole> roles = sysRoleService.selectRoleByUser(userInfo);
            for (SysRole role : roles) {
                authorizationInfo.addRole(role.getRole());
            }
            List<SysPermission> sysPermissions = sysPermissionService.selectPermByUser(userInfo);
            for (SysPermission perm : sysPermissions) {
                authorizationInfo.addStringPermission(perm.getPermission());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return authorizationInfo;
    }

    /*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String name = token.getUsername();
        String password = String.valueOf(token.getPassword());
        SysUser user1 = new SysUser();
        user1.setPassword(password);
        user1.setUsername(name);
        //访问一次，计数一次
        ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
        opsForValue.increment(SHIRO_LOGIN_COUNT + name, 1);
        //计数大于5时，设置用户被锁定一小时
        if (Integer.parseInt(opsForValue.get(SHIRO_LOGIN_COUNT + name)) == 5) {
            opsForValue.set(SHIRO_IS_LOCK + name, "LOCK");
            stringRedisTemplate.expire(SHIRO_IS_LOCK + name, 60, TimeUnit.MINUTES);
        }
        if ("LOCK".equals(opsForValue.get(SHIRO_IS_LOCK + name))) {
            throw new DisabledAccountException("由于密码输入错误次数大于5次，帐号已经禁止登录！");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", name);
        String pawDES = PasswordHelper.encryptPassword(user1);
        map.put("pswd", pawDES);
        SysUser user = null;
        // 从数据库获取对应用户名密码的用户
        List<SysUser> userList = userInfoService.selectByMap(map);
        if (userList.size() != 0) {
            user = userList.get(0);
        }
        if (null == user) {
            throw new AccountException("帐号或密码不正确！");
        } else if ("1".equals(user.getStatus())) {
            /**
             * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
             */
            throw new DisabledAccountException("此帐号已经设置为禁止登录！");
        } else {
            //登录成功
            //更新登录时间 last login time
            //user.setLastLoginTime(new Date());
            //sysUserService.updateById(user);
            //清空登录计数
            opsForValue.set(SHIRO_LOGIN_COUNT + name, "0");
        }
        Logger.getLogger(getClass()).info("身份认证成功，登录用户：" + name);
        System.out.println(user.getPassword());
        return new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes(user.getUsername()), getName());

    }

}
