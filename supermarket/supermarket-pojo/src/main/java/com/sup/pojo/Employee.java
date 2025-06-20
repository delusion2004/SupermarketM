package com.sup.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    private Long employeeId;
    private String employeeName;
    private int employeeSex;
    private int employeeAge;
    private String employeeTitle;
    private LocalDateTime entryDate;
    private String password;
}
