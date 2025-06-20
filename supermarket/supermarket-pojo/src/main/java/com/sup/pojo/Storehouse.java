package com.sup.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storehouse implements Serializable {
    private int storehouseId;
    private String storehouseName;
}
