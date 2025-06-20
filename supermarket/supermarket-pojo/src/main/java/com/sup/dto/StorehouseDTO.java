package com.sup.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StorehouseDTO implements Serializable{
    //仓库编号
    private Long storehouse_id;
    //仓库名称
    private String storehouseName;
}
