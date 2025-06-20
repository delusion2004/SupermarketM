package com.sup.controller;

import com.sup.pojo.Goods;
import com.sup.result.Result;
import com.sup.service.GoodsNumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goodsNum")
public class GoodsNumController {
    private static final Logger log = LoggerFactory.getLogger(GoodsNumController.class);
    @Autowired
    private GoodsNumService goodsNumService;
    /**
     * 获取商品的数量信息等
     */
    @GetMapping("/getAllNum")
    public Result<List<Goods>> getAllNum(){
        List<Goods> list=goodsNumService.getAllNum();
        return Result.success(list);
    }
    /**
     * 根据id查询
     */
    @GetMapping("/{id}")
    public Result<Goods> findById(@PathVariable Long id){
        Goods goods=goodsNumService.findById(id);
        return Result.success(goods);
    }
    /**
     * 根据id获取信息，来实现数量增加
     */
    @PostMapping("/addNum/{id}")
    public Result addNum(@PathVariable Long id){
        Goods goods=goodsNumService.findById(id);
        int numt=goods.getStoreGoodsNum()+1;
        //goods.setStoreGoodsNum(numt);
        goodsNumService.updateNum(numt,id);
        log.info("添加过后商品的数量为{}",goods.getStoreGoodsNum());
        return Result.success();
    }
    /**
     * 根据id获取信息，来实现数量的减少
     */
    @PostMapping("/reduceNum/{id}")
    public Result reduceNum(@PathVariable Long id){
        Goods goods=goodsNumService.findById(id);
        int numt=goods.getStoreGoodsNum()-1;
        goodsNumService.updateNum(numt,id);
        log.info("减少过后商品的数量为{}",goods.getStoreGoodsNum());
        return Result.success();
    }
}
