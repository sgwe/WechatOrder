package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * @Author yangxi
 * @Date 2019/8/9 11:06
 * 支付
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    /* 退款 */
    RefundResponse refund(OrderDTO orderDTO);
}
