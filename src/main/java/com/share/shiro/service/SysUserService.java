package com.share.shiro.service;

import com.share.shiro.vo.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserService {
    List<SysUser> selectByMap(Map<String, Object> map);
}
