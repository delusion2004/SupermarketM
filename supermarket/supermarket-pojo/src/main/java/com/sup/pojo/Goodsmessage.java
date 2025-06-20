package com.sup.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goodsmessage implements Serializable {
    private Long goodsId;
    private String goodsName;
    private double goodsPrice;
    private String goodstype;
}
