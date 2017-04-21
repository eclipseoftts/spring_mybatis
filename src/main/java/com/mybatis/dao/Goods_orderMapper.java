package com.mybatis.dao;

import com.mybatis.model.Goods_order;

public interface Goods_orderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods_order record);

    int insertSelective(Goods_order record);

    Goods_order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods_order record);

    int updateByPrimaryKey(Goods_order record);
}