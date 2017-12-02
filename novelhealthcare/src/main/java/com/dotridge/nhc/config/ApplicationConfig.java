package com.dotridge.nhc.config;
import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = {"com.dotridge.nhc.repository", "com.dotridge.nhc.service"})
@PropertySource(value = {"classpath:hibernate.properties"})
@PropertySource(value = {"classpath:jndi.properties"})
public class ApplicationConfig {

  @Autowired
  private Environment env;

  public Properties setHibernateProperties() {
    Properties hibernateProperties = new Properties();
    hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernateDialect"));
    hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernateShowSql"));
    hibernateProperties.setProperty("hibernate.format_sql", env.getProperty("hibernateFormatSql"));
    hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernateHbmToDDL"));
    hibernateProperties.setProperty("hibernate.hbm2ddl.import_files", env.getProperty("ImportSqlFiles"));
    return hibernateProperties;
  }

  public DataSource createDataSourceBean() {
    DataSource dataSource = null;
    try {
      dataSource = (DataSource) new JndiTemplate().lookup(env.getProperty("jndi.datasource"));
    } catch (NamingException e) {
      e.printStackTrace();
    }
    return dataSource;
  }

  @Bean("sessionFactory")
  public LocalSessionFactoryBean createLocalSessionFactoryBean() {
    LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
    localSessionFactoryBean.setDataSource(createDataSourceBean());
    localSessionFactoryBean.setHibernateProperties(setHibernateProperties());
    localSessionFactoryBean.setPackagesToScan("com.dotridge.nhc.entity");
    return localSessionFactoryBean;
  }
}
