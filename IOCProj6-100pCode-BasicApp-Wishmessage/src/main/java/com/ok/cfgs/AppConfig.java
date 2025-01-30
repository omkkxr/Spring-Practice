package com.ok.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ok")
public class AppConfig {

	@Bean("date")
	public LocalDateTime getdate() {
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}
}
