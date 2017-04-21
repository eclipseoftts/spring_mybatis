package com.mybatis.dao;

import com.mybatis.model.Goods_size_color;

public interface Goods_size_colorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods_size_color record);

    int insertSelective(Goods_size_color record);

    Goods_size_color selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods_size_color record);

    int updateByPrimaryKey(Goods_size_color record);
}