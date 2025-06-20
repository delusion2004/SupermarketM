package com.sup.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GoodsVo {
    private Long id;
    private Long goodsId;
    private String goodsName;
    private Double goodsPrice;
    private int storeGoodsNum;
    private int storehouseIf;
    private LocalDateTime deliveryTime;
    private LocalDateTime storageTime;
    private int deliveryNum;
}
