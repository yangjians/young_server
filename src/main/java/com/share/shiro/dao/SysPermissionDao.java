package com.share.shiro.dao;


import com.share.shiro.vo.SysPermission;
import com.share.shiro.vo.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysPermissionDao {

    List<SysPermission> selectPermByUser(UserInfo userInfo);

}
