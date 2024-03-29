package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Author yangxi
 * @Date 2019/7/18 17:02
 */
@Getter
public enum  ProductStatusEnum implements CodeEnum {

    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
