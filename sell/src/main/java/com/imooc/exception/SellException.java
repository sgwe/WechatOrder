package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Author yangxi
 * @Date 2019/7/22 11:06
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
