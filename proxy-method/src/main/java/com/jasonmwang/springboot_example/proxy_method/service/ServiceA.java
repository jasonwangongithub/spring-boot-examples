package com.jasonmwang.springboot_example.proxy_method.service;

public class ServiceA {

	private final ServiceC seviceC;
	
	public ServiceA(ServiceC serviceC) {
		seviceC = serviceC;
	}
}
