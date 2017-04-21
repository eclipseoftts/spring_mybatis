package com.mybatis.dao;

import com.mybatis.model.News_type;

public interface News_typeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(News_type record);

    int insertSelective(News_type record);

    News_type selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(News_type record);

    int updateByPrimaryKey(News_type record);
}