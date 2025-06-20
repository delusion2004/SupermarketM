package com.sup.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Supplier implements Serializable {
    private int SupplierId;
    private String SupplierName;
    private String SupplierTelephone;
    private String SupplierAddress;
}
