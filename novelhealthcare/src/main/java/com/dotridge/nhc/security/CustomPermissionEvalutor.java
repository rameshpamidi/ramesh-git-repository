package com.dotridge.nhc.security;

import java.io.Serializable;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

public class CustomPermissionEvalutor implements PermissionEvaluator {

	@Override
	public boolean hasPermission(Authentication arg0, Object arg1, Object arg2) {
		return false;
	}

	@Override
	public boolean hasPermission(Authentication arg0, Serializable arg1, String arg2, Object arg3) {
		return false;
	}

}
