package com.sup.service;

import com.sup.dto.StorehouseDTO;
import com.sup.pojo.Goods;
import com.sup.pojo.Goodsmessage;
import com.sup.pojo.Storehouse;
import com.sup.vo.StorehouseVo;

import java.util.List;

public interface StorehouseService {
    /**
     * 新增仓库信息
     * @param storehouseDTO
     */
    void addstore(StorehouseDTO storehouseDTO);

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
    void deleteStore(Long id);

    /**
     * 更新仓库信息
     * @param storehouseDTO
     */
    void updateStore(StorehouseDTO storehouseDTO);

    /**
     * 查询所有仓库信息
     * @return
     */
    List<Storehouse> getAll();

    /**
     * 根据仓库名称查询商品信息
     * @param name
     * @return
     */
    List<Goodsmessage> getBystorehouseName(String name);
}
