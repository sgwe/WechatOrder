package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @Author yangxi
 * @Date 2019/8/22 16:33
 * 卖家端
 */
public interface SellerService {
    /**
     *功能描述
     * 通过openid查询卖家端信息
     * @param openid
     * @return com.imooc.dataobject.SellerInfo
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
