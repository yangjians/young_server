package com.share.lession.shiro.dao;

import com.share.lession.shiro.vo.SysRole;
import com.share.lession.shiro.vo.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
@Repository
public interface SysRoleDao {

    List<SysRole> selectRoleByUser(UserInfo userInfo);
}
