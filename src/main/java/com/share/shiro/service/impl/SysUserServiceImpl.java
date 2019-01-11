package com.share.shiro.service.impl;

import com.share.shiro.dao.SysUserDao;
import com.share.shiro.vo.SysUser;
import com.share.shiro.vo.UserInfo;
import com.share.shiro.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> selectByMap(Map<String, Object> map) {
        return sysUserDao.selectByMap(map);
    }
}
