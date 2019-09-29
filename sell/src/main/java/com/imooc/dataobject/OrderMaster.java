package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author yangxi
 * @Date 2019/7/21 15:27
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {


    /* 订单id */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /* 支付状态，默认为0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /* 订单创建时间 */
    private Date createTime;

    /* 订单更新时间 */
    private Date updateTime;

}
