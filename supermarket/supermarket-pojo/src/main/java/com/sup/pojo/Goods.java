package com.sup.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    private Long id;
    private Long goodsId;
    private String goodsName;
    private double goodsPrice;
    private int storeGoodsNum;
    private int storehouseId;
    private LocalDateTime storageTime;
    private LocalDateTime deliveryTime;
    private int deliverNum;
}
