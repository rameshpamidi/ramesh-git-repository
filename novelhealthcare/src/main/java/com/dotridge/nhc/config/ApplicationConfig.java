package com.dotridge.nhc.config;

import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = { "com.dotridge.nhc.repository", "com.dotridge.nhc.service" })
@PropertySource(value = { "classpath:hibernate.properties" })
@PropertySource(value = { "classpath:jndi.properties" })
@ImportResource(value = { "classpath:novelhealth_security.xml" })
@Import(WebSecurityConfig.class)
public class ApplicationConfig {

	@Autowired
	private Environment env;

	@Autowired
	DataSource dataSource;

	public Properties setHibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernateDialect"));
		hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernateShowSql"));
		hibernateProperties.setProperty("hibernate.format_sql", env.getProperty("hibernateFormatSql"));
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernateHbmToDDL"));
		hibernateProperties.setProperty("hibernate.hbm2ddl.import_files", env.getProperty("ImportSqlFiles"));
		hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", env.getProperty("secondLevelCache"));
		hibernateProperties.setProperty("hibernate.cache.use_query_cache", env.getProperty("queryCahcheing"));
		hibernateProperties.setProperty("hibernate.cache.region.factory_class",
				env.getProperty("cacheRegionFactoryClass"));
		return hibernateProperties;
	}

	@Bean("dataSource")
	public DataSource getDataSource() {

		DataSource dataSource = null;
		try {
			dataSource = (DataSource) new JndiTemplate().lookup(env.getProperty("jndi.datasource"));
		} catch (NamingException e) {
			e.printStackTrace();
		}

		/*
		 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 * dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		 * dataSource.setUrl("jdbc:mysql://localhost:3306/novelhealthcare_db");
		 * dataSource.setUsername("root"); dataSource.setPassword("ramesh");
		 */
		return dataSource;
	}

	@Bean("sessionFactory")
	public LocalSessionFactoryBean createLocalSessionFactoryBean() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(getDataSource());
		localSessionFactoryBean.setHibernateProperties(setHibernateProperties());
		localSessionFactoryBean.setPackagesToScan("com.dotridge.nhc.entity");
		return localSessionFactoryBean;
	}
}
