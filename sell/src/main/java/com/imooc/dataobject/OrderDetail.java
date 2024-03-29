package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author yangxi
 * @Date 2019/7/21 15:58
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /* 订单id */
    private String orderId;

    /* 商品id */
    private String productId;

    /* 商品名字 */
    private String productName;

    /* 商品单价 */
    private BigDecimal productPrice;

    /* 商品数量 */
    private Integer productQuantity;

    /* 商品小图 */
    private String productIcon;
}
