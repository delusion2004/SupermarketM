package com.sup.controller;

import com.sup.dto.StorehouseDTO;
import com.sup.pojo.Goods;
import com.sup.pojo.Goodsmessage;
import com.sup.pojo.Storehouse;
import com.sup.result.Result;
import com.sup.service.StorehouseService;
import com.sup.vo.StorehouseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/storehouse")
public class StorehouseController {
    @Autowired
    private StorehouseService storehouseService;

    /**
     * 新增仓库信息
     */
    @PostMapping("/addstore")
    public Result addstore(@RequestBody StorehouseDTO storehouseDTO){
        log.info("当前输入的storehouseDTO是{}",storehouseDTO);
        storehouseService.addstore(storehouseDTO);
        return Result.success();
    }
    /**
     * 根据id查询仓库信息
     */
    @GetMapping("/findById/{id}")
    public Result findById(@PathVariable Long id){
        StorehouseVo storehouseVo=storehouseService.findById(id);
        return Result.success(storehouseVo);
    }
    /**
     * 删除仓库信息
     */
    @DeleteMapping("/deleteStore/{id}")
    public Result deleteStore(@PathVariable Long id){
        storehouseService.deleteStore(id);
        return Result.success();
    }
    /**
     * 更新仓库信息
     */
    @PutMapping("/updateStore")
    public Result updateStore(@RequestBody StorehouseDTO storehouseDTO){
        storehouseService.updateStore(storehouseDTO);
        return Result.success();
    }
    /**
     * 查询所有仓库信息
     */
    @GetMapping("/getAll")
    public Result<List<Storehouse>> getAll(){
        List<Storehouse> list=storehouseService.getAll();
        return Result.success(list);
    }
    /**
     * 根据仓库名称来查询商品信息
     */
    @GetMapping("/lsitBystorehouseName/{name}")
    public Result<List<Goodsmessage>> getBystorehouseName(@PathVariable String name){
        log.info("输入的仓库名称{}",name);
        List<Goodsmessage> list=storehouseService.getBystorehouseName(name);
        log.info("获得的商品信息{}",list);
        return Result.success(list);
    }

}
