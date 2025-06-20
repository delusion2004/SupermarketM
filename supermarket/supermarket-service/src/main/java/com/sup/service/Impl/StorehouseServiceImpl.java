package com.sup.service.Impl;

import com.sup.dto.StorehouseDTO;
import com.sup.mapper.StorehouseMapper;
import com.sup.pojo.Goods;
import com.sup.pojo.Goodsmessage;
import com.sup.pojo.Storehouse;
import com.sup.service.StorehouseService;
import com.sup.vo.StorehouseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorehouseServiceImpl implements StorehouseService {
    @Autowired
    private StorehouseMapper storehouseMapper;
    /**
     * 新增商店信息
     * @param storehouseDTO
     */
    @Override
    public void addstore(StorehouseDTO storehouseDTO) {
        Storehouse storehouse=new Storehouse();
        BeanUtils.copyProperties(storehouseDTO,storehouse);
        storehouseMapper.addstore(storehouse);
    }

    /**
     * 根据id查询仓库信息
     * @param id
     * @return
     */
    @Override
    public StorehouseVo findById(Long id) {
        StorehouseVo storehouseVo=storehouseMapper.findById(id);
        return storehouseVo;
    }

    /**
     * 删除仓库信息
     * @param id
     */
    @Override
    public void deleteStore(Long id) {
        storehouseMapper.deleteMapper(id);

    }

    /**
     * 更新仓库信息
     * @param storehouseDTO
     */
    @Override
    public void updateStore(StorehouseDTO storehouseDTO) {
        Storehouse storehouse=new Storehouse();
        BeanUtils.copyProperties(storehouseDTO,storehouse);
        storehouseMapper.updateStore(storehouse);
    }

    /**
     * 查询所有仓库信息
     * @return
     */
    @Override
    public List<Storehouse> getAll() {
        List<Storehouse> list=storehouseMapper.getAll();
        return list;
    }

    /**
     * 根据仓库名称查询商品信息
     * @param name
     * @return
     */
    @Override
    public List<Goodsmessage> getBystorehouseName(String name) {
        return storehouseMapper.getBystorehouseName(name);
    }

}
