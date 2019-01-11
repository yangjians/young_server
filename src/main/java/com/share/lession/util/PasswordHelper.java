package com.share.lession.util;

import com.share.lession.shiro.vo.SysUser;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {

    private static String algorithmName = "md5";
    private static int hashIterations = 2;

    public static String encryptPassword(SysUser user) {
        String newPassword = new SimpleHash(algorithmName, user.getPassword(), ByteSource.Util.bytes(user.getUsername()), hashIterations).toHex();
        return newPassword;

    }

    public static void main(String[] args) {
        SysUser user = new SysUser();
        user.setUsername("admin");
        user.setPassword("admin");
        System.out.println(PasswordHelper.encryptPassword(user));
    }
}