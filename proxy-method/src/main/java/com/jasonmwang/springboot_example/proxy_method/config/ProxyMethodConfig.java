package com.jasonmwang.springboot_example.proxy_method.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jasonmwang.springboot_example.proxy_method.service.ServiceD;
import com.jasonmwang.springboot_example.proxy_method.service.ServiceE;
import com.jasonmwang.springboot_example.proxy_method.service.ServiceF;

@Configuration
public class ProxyMethodConfig {

	@Bean
	ServiceF serviceF() {
		return new ServiceF();
	}
	
	@Bean
	ServiceD serviceD() {
		return new ServiceD(serviceF());
	}
	
	@Bean
	ServiceE serviceE() {
		return new ServiceE(serviceF());
	}
}
