package com.dotridge.nhc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages={"com.dotridge.nhc.security"})
//@EnableGlobalMethodSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("customAuthenticationProvider")
	private AuthenticationProvider authenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		  auth.authenticationProvider(authenticationProvider);
		
	}

}