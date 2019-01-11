package com.share.shiro.dao;

import com.share.shiro.vo.SysRole;
import com.share.shiro.vo.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysRoleDao {

    List<SysRole> selectRoleByUser(UserInfo userInfo);
}
