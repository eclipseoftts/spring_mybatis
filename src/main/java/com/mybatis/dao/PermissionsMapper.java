package com.mybatis.dao;

import com.mybatis.model.Permissions;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}