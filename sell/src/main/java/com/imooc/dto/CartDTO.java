package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * @Author yangxi
 * @Date 2019/7/22 16:26
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
