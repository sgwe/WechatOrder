package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.EnumUtil;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author yangxi
 * @Date 2019/7/21 22:10
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /* 订单id */
    private String orderId;

    /* 买家名字 */
    private String buyerName;

    /* 买家电话号码 */
    private String buyerPhone;

    /* 买家地址 */
    private String buyerAddress;

    /* 买家微信公开id */
    private String buyerOpenid;

    /* 订单总金额 */
    private BigDecimal orderAmount;

    /* 订单状态，默认为0新下单 */
    private Integer orderStatus;

    /* 支付状态，默认为0未支付 */
    private Integer payStatus;

    /* 订单创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /* 订单更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /* 订单详情列表 */
    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
