package com.imooc.form;

import lombok.Data;


/**
 * @Author yangxi
 * @Date 2019/8/22 9:48
 */
@Data
public class CategoryForm {

    /** 类目id. */
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
