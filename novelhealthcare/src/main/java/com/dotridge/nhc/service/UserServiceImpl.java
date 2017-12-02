package com.dotridge.nhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.nhc.repository.UserDao;
import com.dotridge.nhc.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User getUserByName(String name) {
		 User user = userDao.getUserByName(name);
		 return user;
	}

}
