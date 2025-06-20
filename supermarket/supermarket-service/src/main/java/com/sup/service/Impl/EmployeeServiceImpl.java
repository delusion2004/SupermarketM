package com.sup.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sup.dto.EmployeeDTO;
import com.sup.dto.EmployeePageDTO;
import com.sup.mapper.EmployeeMapper;
import com.sup.pojo.Employee;
import com.sup.result.PageResult;
import com.sup.service.EmployeeService;
import com.sup.vo.EmployeeVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    private EmployeeMapper employeeMapper;
    /**
     * 新增员工
     * @param employeeDTO
     */
    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        employee.setEntryDate(LocalDateTime.now());
        employeeMapper.addEmployee(employee);
    }

    /**
     * 根据id删除员工
     * @param id
     */
    @Override
    public void deleteEmployee(Long id) {
        employeeMapper.deleteEmployee(id);
    }

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @Override
    public EmployeeVo findById(Long id) {
        EmployeeVo employeeVo= employeeMapper.findById(id);
        return employeeVo;
    }

    /**
     * 更新员工
     * @param employeeDTO
     */
    @Override
    public void updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        log.info("现在的employee是{}",employee);
        employeeMapper.updateEmployee(employee);
    }

    /**
     * 分页查询员工
     * @param employeePageDTO
     * @return
     */
    @Override
    public PageResult page(EmployeePageDTO employeePageDTO) {
        PageHelper.startPage(employeePageDTO.getPage(),employeePageDTO.getPageSize());
        Page<Employee> page= employeeMapper.page(employeePageDTO);
        PageResult pageResult=new PageResult(page.getTotal(),page.getResult());
        return pageResult;
    }

    @Override
    public Employee findByUserName(String name) {
        return  employeeMapper.findByUserName(name);
    }

    /**
     * 获取所有员工信息
     * @return
     */
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees=employeeMapper.getAllEmployee();
        return employees;
    }

    /**
     * 根据既定id查询员工
     * @param id
     * @return
     */
    @Override
    public Employee getId(Long id) {
        Employee employee=employeeMapper.getId(id);
        return employee;
    }
}
