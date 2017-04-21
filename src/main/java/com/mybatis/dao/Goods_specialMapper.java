package com.mybatis.dao;

import com.mybatis.model.Goods_special;

public interface Goods_specialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods_special record);

    int insertSelective(Goods_special record);

    Goods_special selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods_special record);

    int updateByPrimaryKey(Goods_special record);
}