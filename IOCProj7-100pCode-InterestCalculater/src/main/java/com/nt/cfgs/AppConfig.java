package com.nt.cfgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource(locations = "com/nt/cfgs/applicationContext.xml")
@PropertySource(value = "com/nt/commons/jdbc.properties")
public class AppConfig {

	@Autowired
	private Environment en;

	@Bean("ds")
	public DriverManagerDataSource get() {
		DriverManagerDataSource dt = new DriverManagerDataSource();
		dt.setDriverClassName(en.getRequiredProperty("jdbc.driver"));
		dt.setUrl(en.getRequiredProperty("jdbc.url"));
		dt.setUsername(en.getRequiredProperty("db.user"));
		dt.setPassword(en.getRequiredProperty("db.pwd"));
		return dt;
	}
}
