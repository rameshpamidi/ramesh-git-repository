package com.dotridge.nhc.repository;

import com.dotridge.nhc.entity.UserProfile;
public interface UserDetailsDao {
	public UserProfile getUserDetials(String name);
}
