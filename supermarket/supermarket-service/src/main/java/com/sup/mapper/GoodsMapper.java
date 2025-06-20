package com.sup.mapper;

import com.sup.pojo.Goodsmessage;
import com.sup.vo.GoodsMessageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsMapper {
    /**
     * 新增货物
     * @param goodsmessage
     */
    void addgoods(Goodsmessage goodsmessage);

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    GoodsMessageVo findById(Long id);

    /**
     * 根据id删除商品信息
     * @param id
     */
    void deleteGoods(Long id);

    /**
     * 修改商品信息
     * @param goodsmessage
     */
    void updata(Goodsmessage goodsmessage);

    @Select("select * from supermarket.goodsmessage")
    List<GoodsMessageVo> getAll();
}
