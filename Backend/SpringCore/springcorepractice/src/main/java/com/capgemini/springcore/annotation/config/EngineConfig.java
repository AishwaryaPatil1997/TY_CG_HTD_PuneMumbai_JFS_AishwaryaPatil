package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.beans.ISuzu;
import com.capgemini.springcore.annotation.beans.VolksWagon;
import com.capgemini.springcore.interfaces.Engine;

@Configuration 
public class EngineConfig {

	@Bean(name ="ISuzu")
	@Primary
	public Engine getISuzu() {
		return new ISuzu();
	}
	
	@Bean(name = "VolksWagon")
	public Engine getVolksWagon() {
		return new VolksWagon();
	}
}
