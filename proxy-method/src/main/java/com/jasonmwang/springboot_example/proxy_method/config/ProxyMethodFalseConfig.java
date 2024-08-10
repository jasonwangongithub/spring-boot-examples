package com.jasonmwang.springboot_example.proxy_method.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jasonmwang.springboot_example.proxy_method.service.ServiceA;
import com.jasonmwang.springboot_example.proxy_method.service.ServiceB;
import com.jasonmwang.springboot_example.proxy_method.service.ServiceC;

@Configuration(proxyBeanMethods = false)
public class ProxyMethodFalseConfig {

	@Bean
	ServiceC serviceC() {
		return new ServiceC();
	}
	
	@Bean
	ServiceA serviceA() {
		return new ServiceA(serviceC());
	}
	
	@Bean
	ServiceB serviceB() {
		return new ServiceB(serviceC());
	}
}
