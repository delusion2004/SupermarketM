package com.sup.service;

import com.sup.dto.GoodsMessageDTO;
import com.sup.pojo.Goods;

import java.util.List;

public interface GoodsNumService {
    /**
     * 获取所有商品的数量等信息
     * @return
     */
    List<Goods> getAllNum();

    /**
     * 添加商品数量等信息
     * @param goodsMessageDTO
     */
    void addgoodsNum(GoodsMessageDTO goodsMessageDTO);

    /**
     * 根据id查询
     * @return
     */
    Goods findById(Long id);

    /**
     * 修改商品的数量
     * @param storeGoodsNum
     */
    void updateNum(int storeGoodsNum,Long id);
}
