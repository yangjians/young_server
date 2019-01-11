package com.share.shiro.service.impl;

import com.share.shiro.vo.SysRole;
import com.share.shiro.vo.UserInfo;
import com.share.shiro.dao.SysRoleDao;
import com.share.shiro.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    public List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception {
        return sysRoleDao.selectRoleByUser(userInfo);
    }
}
