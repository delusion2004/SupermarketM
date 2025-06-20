package com.sup.vo;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EmployeeVo {
    private int employeeId;
    private String employeeName;
    private int employeeSex;
    private int employeeAge;
    private String employeeTitle;
    private LocalDateTime entryDate;
}
