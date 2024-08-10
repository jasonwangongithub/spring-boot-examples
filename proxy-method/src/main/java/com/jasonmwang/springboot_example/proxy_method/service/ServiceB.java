package com.jasonmwang.springboot_example.proxy_method.service;

public class ServiceB {

private final ServiceC seviceC;
	
	public ServiceB(ServiceC serviceC) {
		seviceC = serviceC;
	}
}
