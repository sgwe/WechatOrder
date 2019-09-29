package com.imooc.utils;

import java.util.Random;

/**
 * @Author yangxi
 * @Date 2019/7/22 16:00
 */
public class KeyUtil {

    /**
     * 功能描述: 自动生成订单id（生成唯一主键）
     * 格式：时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
