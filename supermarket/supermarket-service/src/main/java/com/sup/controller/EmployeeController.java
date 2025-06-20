package com.sup.controller;

import com.sup.dto.EmployeeDTO;
import com.sup.dto.EmployeePageDTO;
import com.sup.pojo.Employee;
import com.sup.pojo.EmployeeLogin;
import com.sup.result.PageResult;
import com.sup.result.Result;
import com.sup.service.EmployeeService;
import com.sup.vo.EmployeeVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/employee")
//@Api(tags="员工管理相关接口")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    /**
     * 添加员工信息
     * @param employeeDTO
     * @return
     */
    @PostMapping("/addEmployee")
    public Result addEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeService.addEmployee(employeeDTO);
        return Result.success();
    }

    /**
     * 批量删除员工信息
     */
    @DeleteMapping("/deleteEmployee/{id}")
    public Result deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return Result.success();
    }
    /**
     * 根据id查询员工
     */
    @GetMapping("/findById/{id}")
    public Result<EmployeeVo> findById(@PathVariable Long id){
        EmployeeVo employeeVo= employeeService.findById(id);
        return Result.success(employeeVo);
    }

    /**
     * 修改员工信息
     * @param employeeDTO
     * @return
     */
    @PutMapping("/updateEmployee")
    public Result updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        log.info("要修改成{}",employeeDTO);
        employeeService.updateEmployee(employeeDTO);
        return Result.success();
    }

    /**
     * 进行分页查询
     */
    @GetMapping("/page")
    public Result<PageResult> page(EmployeePageDTO employeePageDTO){
        PageResult pageResult=employeeService.page(employeePageDTO);
        log.info("数据是{}",pageResult);
        return Result.success(pageResult);
    }
    Long idx;
    @PostMapping("/login")
    public Result login(@RequestBody EmployeeLogin employeeLogin) {
        log.info("传入的employeeLogin数据是{}",employeeLogin);
        log.info("byuser是{}",employeeLogin.getEmployeeName());
        Employee byUserName = employeeService.findByUserName(employeeLogin.getEmployeeName());
        if(Objects.equals(byUserName.getPassword(),employeeLogin.getPassword())){
            idx=byUserName.getEmployeeId();
            return Result.success();
        }else{
            return Result.error("密码错误");
        }
    }
    /**
     * 获取所有员工信息员工
     */
    @GetMapping("/getAll")
    public Result<List<Employee>> getAllEmployee(){
        List<Employee> list= employeeService.getAllEmployee();
        return Result.success(list);
    }
    /**
     * 根据既定id查询员工
     */
    @GetMapping("/getId")
    public Result<Employee> getId(){
        Long id=idx;
        Employee employee=employeeService.getId(id);
        return Result.success(employee);
    }
    /**
     * 根据员工姓名性别查询员工
     */

}
