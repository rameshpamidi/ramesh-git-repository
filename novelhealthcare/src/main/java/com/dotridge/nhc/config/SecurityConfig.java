package com.dotridge.nhc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/")
				.failureUrl("/login?error123").usernameParameter("j_userName").passwordParameter("j_password").loginProcessingUrl("/j_spring_security_check").and().logout()
				.logoutSuccessUrl("/logout").and().exceptionHandling().accessDeniedPage("/403").and().csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		  auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery(
				"select user_name,password from user_profile where user_name=?")
			.authoritiesByUsernameQuery(
				"select username,role_id_fk from user_profile where user_name=?");
		
	}

}