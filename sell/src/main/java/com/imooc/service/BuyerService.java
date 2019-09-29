package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Author yangxi
 * @Date 2019/7/25 17:15
 */
public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
