package com.sup.service.Impl;

import com.sup.dto.GoodsMessageDTO;
import com.sup.mapper.GoodsNumMapper;
import com.sup.mapper.StorehouseMapper;
import com.sup.pojo.Goods;
import com.sup.pojo.Storehouse;
import com.sup.service.GoodsNumService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsNumServiceImpl implements GoodsNumService {
    @Autowired
    private GoodsNumMapper goodsNumMapper;
    @Autowired
    private StorehouseMapper storehouseMapper;
    /**
     * 获取所有商品的数量等信息
     * @return
     */
    @Override
    public List<Goods> getAllNum() {
        List<Goods> list=goodsNumMapper.getAllNum();
        return list;
    }

    /**
     * 添加商品数量等信息
     * @param goodsMessageDTO
     */
    @Override
    public void addgoodsNum(GoodsMessageDTO goodsMessageDTO) {

        Goods goods=new Goods();
        goods.setGoodsId(goodsMessageDTO.getGoodsId());
        goods.setGoodsName(goodsMessageDTO.getGoodsName());
        goods.setGoodsPrice(goodsMessageDTO.getGoodsPrice());
        goods.setStoreGoodsNum(1);
        Storehouse storehouse=storehouseMapper.getstoreByName(goodsMessageDTO.getGoodstype());
        goods.setStorehouseId(storehouse.getStorehouseId());
        goodsNumMapper.addgoodsNum(goods);
    }

    /**
     * 根据id查询
     * @return
     */
    @Override
    public Goods findById(Long id) {
        return goodsNumMapper.findById(id);
    }

    /**
     * 修改商品的数量
     * @param storeGoodsNum
     */
    @Override
    public void updateNum(int storeGoodsNum,Long id) {
        goodsNumMapper.updateNum(storeGoodsNum,id);
    }

}
