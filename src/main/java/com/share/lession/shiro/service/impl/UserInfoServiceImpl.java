package com.share.lession.shiro.service.impl;

import com.share.lession.shiro.vo.SysUser;
import com.share.lession.shiro.vo.UserInfo;
import com.share.lession.shiro.dao.UserInfoDao;
import com.share.lession.shiro.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUserName(String username) {
        return userInfoDao.findByUserName(username);
    }

    @Override
    public List<SysUser> selectByMap(Map<String, Object> map) {
        return userInfoDao.selectByMap(map);
    }
}
