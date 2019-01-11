package com.share.shiro.service;

import com.share.shiro.vo.SysRole;
import com.share.shiro.vo.UserInfo;

import java.util.List;

public interface SysRoleService {

    List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception;
}
