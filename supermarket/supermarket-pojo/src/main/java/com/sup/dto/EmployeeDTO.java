package com.sup.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class EmployeeDTO implements Serializable {
    private Long employeeId;
    private String employeeName;
    private int employeeSex;
    private int employeeAge;
    private String employeeTitle;
    private String password;
}
