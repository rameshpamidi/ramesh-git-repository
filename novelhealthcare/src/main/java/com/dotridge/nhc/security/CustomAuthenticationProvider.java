package com.dotridge.nhc.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.dotridge.nhc.entity.Role;
import com.dotridge.nhc.entity.UserProfile;
import com.dotridge.nhc.service.UserDetailsService;

@Component("customAuthenticationProvider")
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		  
		UserProfile userDetails = userDetailsService.getUserByUserName(authentication.getName());
		if(userDetails!=null&&userDetails.getUserName().equals(authentication.getName())&&userDetails.getPassword().equals((String)authentication.getCredentials()))
				{
			          
					List<GrantedAuthority> authorities =new ArrayList<>();
			          for (Role role : userDetails.getRoles()) {
			        	  GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(role.getRoleName());
			        	  authorities.add(grantedAuthority);
					}
			          System.out.println("authentication success");
			          System.out.println("user name is:\t"+userDetails.getUserName());
			          System.out.println("user roles are:\t"+authorities);
			          return new UsernamePasswordAuthenticationToken(authentication.getName(), authentication.getCredentials().toString(), authorities);
				}
		System.out.println("authentication fail");
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		 return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
