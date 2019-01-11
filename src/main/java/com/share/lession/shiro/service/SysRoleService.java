package com.share.lession.shiro.service;

import com.share.lession.shiro.vo.SysRole;
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
public interface SysRoleService {

    List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception;
}
