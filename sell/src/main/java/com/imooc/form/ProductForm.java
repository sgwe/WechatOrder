package com.imooc.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.utils.EnumUtil;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author yangxi
 * @Date 2019/8/20 20:33
 */
@Data
public class ProductForm {

    private String productId;

    /* 名字 */
    private String productName;

    /* 单价 */
    private BigDecimal productPrice;

    /* 库存 */
    private Integer productStock;

    /* 描述 */
    private String productDescription;

    /* 小图 */
    private String productIcon;

    /* 状态 0:正常 1：下架 */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /* 类目编号 */
    private Integer categoryType;

}
