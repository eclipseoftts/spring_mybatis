package com.mybatis.dao;

import java.util.List;

import com.mybatis.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    List<Users> findUserAll();
    
    Users findUsers(String name);
}