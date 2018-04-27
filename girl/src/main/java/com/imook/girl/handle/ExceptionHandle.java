package com.imook.girl.handle;

import com.imook.girl.domain.Result;
import com.imook.girl.exception.GirlException;
import com.imook.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuanjiaping
 * @create 2018-04-27 10:35
 * @description TODO
 **/
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger= LoggerFactory.getLogger(Exception.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }else{
            logger.error("[系统异常]{}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
