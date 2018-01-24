package com.dotridge.nhc.service;

import com.dotridge.nhc.entity.UserProfile;

public interface UserDetailsService {
	public UserProfile getUserByUserName(String userName);

}
