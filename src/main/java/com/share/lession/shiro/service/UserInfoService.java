package com.share.lession.shiro.service;

import com.share.lession.shiro.vo.SysUser;
import com.share.lession.shiro.vo.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
public interface UserInfoService {

    UserInfo findByUserName(String username);

    List<SysUser> selectByMap(Map<String, Object> map);
}
