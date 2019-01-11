package com.share.shiro.dao;


import com.share.shiro.vo.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysUserDao {
    List<SysUser> selectByMap(Map<String, Object> map);
}
