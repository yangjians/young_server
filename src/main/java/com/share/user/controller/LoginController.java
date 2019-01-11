package com.share.user.controller;

import com.share.enums.MessageEnum;
import com.share.exception.UserException;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 描述
 *
 * @author yangjians
 * @Date: 2019/1/11 16:37
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
public class LoginController {
    Logger logger = Logger.getLogger(LoginController.class);
    /**
     * 登录方法
     *
     * @return
     */
    @RequestMapping(value = "/login")
    public Map<String, Object> login() {
        String username = "admin";
        String password = "4dfg";
        boolean rememberMe = true;
        Map<String, Object> resultMap = new HashMap<String, Object>(1);

        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
            SecurityUtils.getSubject().login(token);
            resultMap.put("status", 200);
            resultMap.put("message", "登录成功");

        } catch (Exception e) {
            logger.error("LoginController.login-->",e);
            resultMap.put("status", 500);
            resultMap.put("message", e.getMessage());
        }
        return resultMap;
    }

    /**
     * 未登录，shiro应重定向到登录界面，此处返回未登录状态信息由前端控制跳转页面
     *
     * @return
     */
    @RequestMapping(value = "/unauth")
    public Object unauth() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "1000000");
        map.put("msg", "未登录");
        return map;
    }
}
