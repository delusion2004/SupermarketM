package com.sup.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePageDTO implements Serializable {
    //员工姓名
    private String name;
    //页码
    private int page;
    //每页显示记录数
    private int pageSize;
}
