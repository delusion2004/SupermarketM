package com.sup.mapper;

import com.sup.pojo.Goods;
import com.sup.pojo.Goodsmessage;
import com.sup.pojo.Storehouse;
import com.sup.vo.StorehouseVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StorehouseMapper {
    /**
     * 新增商店信息
     * @param storehouse
     */
    void addstore(Storehouse storehouse);

    /**
     * 根据id查询仓库信息
     * @param id
     * @return
     */
    StorehouseVo findById(Long id);

    /**
     * 删除仓库信息
     * @param id
     */
    void deleteMapper(Long id);

    /**
     * 更新仓库信息
     * @param storehouse
     */
    void updateStore(Storehouse storehouse);

    /**
     * 查询所有仓库信息
     * @return
     */
    @Select("select * from storehouse")
    List<Storehouse> getAll();

    /**
     * 根据仓库信息查询商品信息
     * @param name
     * @return
     */
    List<Goodsmessage> getBystorehouseName(String name);
    /**
     * 根据仓库名称查询仓库信息
     */
    @Select("select * from storehouse where storehouse_name=#{name}")
    Storehouse getstoreByName(String name);


}
