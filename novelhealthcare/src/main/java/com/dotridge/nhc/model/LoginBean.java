package com.dotridge.nhc.model;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {
	@NotEmpty(message = "must not be empty")
	private String userName;
	@NotEmpty(message="must not b empty")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
