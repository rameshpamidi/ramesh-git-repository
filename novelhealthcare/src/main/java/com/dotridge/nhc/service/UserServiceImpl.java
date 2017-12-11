package com.dotridge.nhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.nhc.entity.UserProfile;
import com.dotridge.nhc.repository.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public Object[] getUserDetials(String name) {
		Object[] loginDetails=new Object[3];
		System.out.println();
		UserProfile userPorfile = userDao.getUserDetials(name);
		loginDetails[0]=userPorfile.getUserName();
		loginDetails[1]=userPorfile.getPassword();
		loginDetails[2]=userPorfile.getRole().getRoleName();
		
		 return loginDetails;
	}

}
