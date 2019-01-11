package com.share.shiro.service;

import com.share.shiro.vo.SysPermission;
import com.share.shiro.vo.UserInfo;

import java.util.List;

public interface SysPermissionService {

    List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception;
}
