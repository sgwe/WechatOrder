package com.imooc.constant;

/**
 * @Author yangxi
 * @Date 2019/9/2 16:13
 * redis常量
 */
public interface RedisConstant {
    String TOKEN_PREFIX = "token_%s";

    // 2小时
    Integer EXPIRE = 7200;
}
