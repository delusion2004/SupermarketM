package com.sup.mapper;

import com.github.pagehelper.Page;
import com.sup.dto.EmployeePageDTO;
import com.sup.pojo.Employee;
import com.sup.vo.EmployeeVo;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    /**
     * 新增员工
     * @param employee
     */
    void addEmployee(Employee employee);

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
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 分页查询
     * @param employeePageDTO
     * @return
     */
    Page<Employee> page(EmployeePageDTO employeePageDTO);
    /**
     * 根据姓名查询员工
     * @param name
     * @return
     */
    Employee findByUserName(String name);

    /**
     * 获取所有员工信息
     * @return
     */
    @Select("select * from employee")
    List<Employee> getAllEmployee();

    /**
     * 根据既定id查询员工
     * @param id
     * @return
     */
    @Select("select * from employee where employee_id=#{id}")
    Employee getId(Long id);
}
