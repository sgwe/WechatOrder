package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author yangxi
 * @Date 2019/7/31 11:17
 */
@Component
@Data
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    /* 开发平台id */
    private String openAppId;

    /* 开发平台密钥 */
    private String openAppSecret;

    /* 公众平台id */
    private String mpAppId;

    /* 公众平台密码 */
    private String mpAppSecret;

    /* 商户号 */
    private String mchId;

    /* 商户密钥 */
    private String mchKey;

    /* 商户证书路径 */
    private String keyPath;

    /* 微信支付异步通知地址 */
    private String notifyUrl;

    /* 微信模板id */
    private Map<String, String> templateId;
}
