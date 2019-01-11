package com.share.shiro.service.impl;

import com.share.shiro.vo.SysPermission;
import com.share.shiro.vo.UserInfo;
import com.share.shiro.dao.SysPermissionDao;
import com.share.shiro.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionDao sysPermissionDao;

    @Override
    public List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception {
        return sysPermissionDao.selectPermByUser(userInfo);
    }
}
