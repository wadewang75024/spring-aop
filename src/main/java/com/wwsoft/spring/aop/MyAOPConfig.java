package com.wwsoft.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wwsoft.spring.aop")
public class MyAOPConfig {
	@Bean
	public Application app(Module module) {
		return new Application(module);
	}
}
