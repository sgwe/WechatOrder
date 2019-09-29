package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Author yangxi
 * @Date 2019/9/4 15:43
 * 消息推送
 */
public interface PushMessageService {

    /**
     *功能描述
     * 订单状态变更消息
     * @param orderDTO
     * @return void
     */
    void orderStatus(OrderDTO orderDTO);
}
