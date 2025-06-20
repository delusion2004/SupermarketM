package com.sup.controller;

import com.sup.dto.GoodsMessageDTO;
import com.sup.result.Result;
import com.sup.service.GoodsNumService;
import com.sup.service.GoodsService;
import com.sup.vo.GoodsMessageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goodsMessage")
@Slf4j
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsNumService goodsNumService;
    /**
     * 添加商品
     * @return
     */
    @PostMapping("/addgoods")
    public Result addgoods(@RequestBody GoodsMessageDTO goodsMessageDTO){
        log.info("输入的goodsMessageDTO的信息是{}",goodsMessageDTO);
        goodsService.addgoods(goodsMessageDTO);
        goodsNumService.addgoodsNum(goodsMessageDTO);
        //在添加商品信息的同时把商品数量表也添加了
        return Result.success();
    }

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public Result<GoodsMessageVo > findById(@PathVariable Long id){
        GoodsMessageVo goodsMessageVo=goodsService.findById(id);
        return Result.success(goodsMessageVo);
    }

    @DeleteMapping("/deleteGoods/{id}")
    public Result deleteGoods(@PathVariable Long id){
        goodsService.deleteGoods(id);
        return Result.success();
    }

    @PutMapping("/updataGoods")
    public Result updataGoods(@RequestBody GoodsMessageDTO goodsMessageDTO){
        goodsService.updataGoods(goodsMessageDTO);
        return Result.success();
    }
    /**
     * 查询所有商品信息
     */
    @GetMapping("/getAll")
    public Result<List<GoodsMessageVo>> getAll(){
        List<GoodsMessageVo> list=goodsService.getAll();
        return Result.success(list);
    }
}
