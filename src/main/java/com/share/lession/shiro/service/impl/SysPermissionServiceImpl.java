package com.share.lession.shiro.service.impl;

import com.share.lession.shiro.vo.SysPermission;
import com.share.lession.shiro.vo.UserInfo;
import com.share.lession.shiro.dao.SysPermissionDao;
import com.share.lession.shiro.service.SysPermissionService;
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
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionDao sysPermissionDao;

    @Override
    public List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception {
        return sysPermissionDao.selectPermByUser(userInfo);
    }
}
