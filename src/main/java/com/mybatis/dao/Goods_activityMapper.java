package com.mybatis.dao;

import com.mybatis.model.Goods_activity;

public interface Goods_activityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods_activity record);

    int insertSelective(Goods_activity record);

    Goods_activity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods_activity record);

    int updateByPrimaryKey(Goods_activity record);
}