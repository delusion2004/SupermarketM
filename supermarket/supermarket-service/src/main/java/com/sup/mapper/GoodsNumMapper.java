package com.sup.mapper;

import com.sup.pojo.Goods;
import com.sup.service.GoodsNumService;
import com.sup.service.GoodsService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface GoodsNumMapper {


    /**
     * 获取商品的所有数量信息
     * @return
     */
    @Select("select * from goods")
    List<Goods> getAllNum();

    /**
     * 添加商品数量信息
     * @param goods
     */
    void addgoodsNum(Goods goods);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from goods where id=#{id}")
    Goods findById(Long id);

    /**
     * 修改商品数量
     * @param storeGoodsNum
     */
    void updateNum(int storeGoodsNum,Long id);
}
