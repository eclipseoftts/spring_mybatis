package com.mybatis.dao;

import com.mybatis.model.Homepage;

public interface HomepageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Homepage record);

    int insertSelective(Homepage record);

    Homepage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Homepage record);

    int updateByPrimaryKey(Homepage record);
}