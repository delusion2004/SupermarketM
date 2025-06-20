package com.sup.service.Impl;

import com.sup.dto.GoodsMessageDTO;
import com.sup.mapper.GoodsMapper;
import com.sup.pojo.Goodsmessage;
import com.sup.service.GoodsService;
import com.sup.vo.GoodsMessageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 新增商品
     * @param goodsMessageDTO
     */
    @Override
    public void addgoods(GoodsMessageDTO goodsMessageDTO) {
        Goodsmessage goodsmessage=new Goodsmessage();
        BeanUtils.copyProperties(goodsMessageDTO,goodsmessage);
        goodsMapper.addgoods(goodsmessage);
    }

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @Override
    public GoodsMessageVo findById(Long id) {
        GoodsMessageVo goodsMessageVo=goodsMapper.findById(id);
        return goodsMessageVo;
    }

    /**
     * 根据id批量删除商品信息
     * @param id
     * @return
     */
    @Override
    public void  deleteGoods(Long id) {
        goodsMapper.deleteGoods(id);
    }

    /**
     * 修改商品信息
     * @param goodsMessageDTO
     */
    @Override
    public void updataGoods(GoodsMessageDTO goodsMessageDTO) {
        Goodsmessage goodsmessage=new Goodsmessage();
        BeanUtils.copyProperties(goodsMessageDTO,goodsmessage);
        log.info("现在的employee是{}",goodsmessage);
        goodsMapper.updata(goodsmessage);

    }

    @Override
    public List<GoodsMessageVo> getAll() {
        List<GoodsMessageVo> list=goodsMapper.getAll();
        return list;
    }
}
