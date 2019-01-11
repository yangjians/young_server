package com.share.handle;

import com.share.common.vo.Result;
import com.share.exception.UserException;
import com.share.user.controller.LoginController;
import com.share.util.MessageUtil;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 描述
 *
 * @author yangjians
 * @Date: 2019/1/11 17:13
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@ControllerAdvice
public class ExceptionHandle {
    Logger logger = Logger.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        logger.info("进入error");
        if(e instanceof UserException){
            UserException userException = (UserException)e;
            return MessageUtil.error(userException.getCode(),userException.getMessage());
        }else {
            logger.error("系统异常{}",e);
            return MessageUtil.error("1000","系统异常！");
        }
    }

}
