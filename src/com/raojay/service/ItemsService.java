package com.raojay.service;

import com.raojay.domain.Items;

import java.util.List;

/**
 * Created by 隽 on 2017/3/18.
 */

public interface ItemsService
{
    List<Items> findAll();

    Items findByID(Integer id);

    void saveOrUpdate(Items items);

    void deleteByID(Integer id);
}
