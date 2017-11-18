package com.dotridge.nhc.repository;

import com.dotridge.nhc.entity.User;
public interface UserDao {
	public User getUserByName(String name);
}
