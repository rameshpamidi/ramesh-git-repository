package com.dotridge.nhc.repository;

import com.dotridge.nhc.entity.UserProfile;
public interface UserDao {
	public UserProfile getUserDetials(String name);
}
