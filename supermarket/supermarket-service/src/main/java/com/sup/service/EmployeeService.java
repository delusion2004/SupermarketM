package com.sup.service;

import com.sup.dto.EmployeeDTO;
import com.sup.dto.EmployeePageDTO;
import com.sup.pojo.Employee;
import com.sup.result.PageResult;
import com.sup.vo.EmployeeVo;

import java.util.List;

public interface EmployeeService {

    /**
     * 新增员工
     * @param employeeDTO
     */
    void addEmployee(EmployeeDTO employeeDTO);

    /**
     * 根据id删除员工
     * @param id
     */
    void deleteEmployee(Long id);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    EmployeeVo findById(Long id);

    /**
     * 修改员工信息
     * @param employeeDTO
     */
    void updateEmployee(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @param employeePageDTO
     * @return
     */
    PageResult page(EmployeePageDTO employeePageDTO);

    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    Employee findByUserName(String name);

    /**
     *获取所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 根据既定id查询员工
     * @param id
     * @return
     */
    Employee getId(Long id);
}
