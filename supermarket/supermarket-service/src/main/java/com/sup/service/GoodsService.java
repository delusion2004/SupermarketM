package com.sup.service;

import com.sup.dto.GoodsMessageDTO;
import com.sup.vo.GoodsMessageVo;

import java.util.List;

public interface GoodsService {
    /**
     * 新增商品
     * @param goodsMessageDTO
     */
    void addgoods(GoodsMessageDTO goodsMessageDTO);

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    GoodsMessageVo findById(Long id);

    /**
     *根据id批量删除商品信息
     * @param id
     * @return
     */
    void deleteGoods(Long id);

    /**
     * 修改商品信息
     * @param goodsMessageDTO
     */
    void updataGoods(GoodsMessageDTO goodsMessageDTO);

    /**
     * 获取所有商品
     * @return
     */
    List<GoodsMessageVo> getAll();
}
