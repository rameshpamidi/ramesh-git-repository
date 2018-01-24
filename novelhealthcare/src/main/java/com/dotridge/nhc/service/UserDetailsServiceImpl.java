package com.dotridge.nhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.nhc.entity.UserProfile;
import com.dotridge.nhc.repository.UserDetailsDao;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsDao  userDetailsDao;

	@Override
	public UserProfile getUserByUserName(String userName) {
		return userDetailsDao.getUserDetials(userName);
				
	}
	
	
}
