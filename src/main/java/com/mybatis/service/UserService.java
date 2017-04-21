package com.mybatis.service;

import java.util.List;
import com.mybatis.model.Users;

public interface UserService {

	public List<Users> findUserAll();
	
	public Users frindUsers(String name);
}
