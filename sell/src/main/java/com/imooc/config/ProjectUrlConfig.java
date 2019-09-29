package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author yangxi
 * @Date 2019/9/2 15:24
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /*微信公众账号授权url*/
    public String wechatAuthorize;

    /*微信开放平台授权url*/
    public String wechatOpenAuthorize;

    /*点餐系统*/
    public String sell;



}
