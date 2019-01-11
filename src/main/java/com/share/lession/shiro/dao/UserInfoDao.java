package com.share.lession.shiro.dao;

import com.share.lession.shiro.vo.SysUser;
import com.share.lession.shiro.vo.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */

@Repository
public interface UserInfoDao {


    UserInfo findByUserName(String username);

    List<SysUser> selectByMap(Map<String, Object> map);

}
