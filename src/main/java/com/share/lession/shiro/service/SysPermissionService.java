package com.share.lession.shiro.service;

import com.share.lession.shiro.vo.SysPermission;
import com.share.lession.shiro.vo.UserInfo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
public interface SysPermissionService {

    List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception;
}
