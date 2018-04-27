package com.imook.girl.exception;

import com.imook.girl.enums.ResultEnum;

/**
 * @author yuanjiaping
 * @create 2018-04-27 10:49
 * @description TODO
 **/
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
