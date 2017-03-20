package com.raojay.service.impl;

import com.raojay.dao.ItemsMapper;
import com.raojay.domain.Items;
import com.raojay.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 隽 on 2017/3/18.
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService
{

    //可以直接注入，但是在idea中会报错
    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll()
    {
        List<Items> list=itemsMapper.findAll();
        return list;
    }

    @Override
    public Items findByID(Integer id)
    {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items)
    {
        itemsMapper.updateByPrimaryKey(items);
    }

    @Override
    public void deleteByID(Integer id)
    {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
