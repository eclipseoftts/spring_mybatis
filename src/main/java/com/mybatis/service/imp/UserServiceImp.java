package com.mybatis.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mybatis.dao.UsersMapper;
import com.mybatis.model.Users;
import com.mybatis.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public List<Users> findUserAll() {
		List<Users> list = usersMapper.findUserAll();
		System.out.println("---------------------------------------------------");
		for (Users users : list) {
			System.out.println(users);
		}
		System.out.println("---------------------------------------------------");
		logger.info(list);
		return list;
	}

	@Override
	public Users frindUsers(String name) {
		Users users = usersMapper.findUsers(name);
		return users;
	}

}
