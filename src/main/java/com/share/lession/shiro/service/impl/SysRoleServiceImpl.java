package com.share.lession.shiro.service.impl;

import com.share.lession.shiro.vo.SysRole;
import com.share.lession.shiro.vo.UserInfo;
import com.share.lession.shiro.dao.SysRoleDao;
import com.share.lession.shiro.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    public List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception {
        return sysRoleDao.selectRoleByUser(userInfo);
    }
}
