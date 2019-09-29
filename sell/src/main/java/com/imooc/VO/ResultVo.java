package com.imooc.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象，既给买家看到的信息
 * @Author yangxi
 * @Date 2019/7/18 21:05
 */
@Data
public class ResultVo<T> {

    /* 错误码 */
    private Integer code;

    /* 提示信息 */
    private String msg;

    /* 具体内容 */
    private T data;
}
