package com.sup.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsMessageDTO implements Serializable {
    //货物编号
    private Long goodsId;
    //货物名称
    private String goodsName;
    //货物价格
    private double goodsPrice;
    //货物类型
    private String goodstype;

}
