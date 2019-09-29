package com.imooc.utils;

/**
 * @Author yangxi
 * @Date 2019/8/17 11:39
 */
public class MathUtil {

    public static final Double MONEY_RANGE = 0.01;

    /**
     *功能描述
     * 比较两个金额是否相等
     * @param d1
     * @param d2
     * @return java.lang.Boolean
     */
    public static Boolean equals(Double d1, Double d2) {

        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }else {
            return false;
        }
    }
}
