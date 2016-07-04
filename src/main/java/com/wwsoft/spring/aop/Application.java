package com.wwsoft.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Application {
	private Module module;
	
	public Module getModule() {
		return module;
	}

	@Autowired
	public Application(Module module) {
		this.module = module;
	}
	
	public void test() {
		System.out.println("Entering com.wwsoft.spring.aop.Application.test...");
		this.module.dummy("Testing AOP with arguments.");
		this.module.setValue(999);
		this.module.dummy("Testing AOP with arguments.");
		System.out.println("Leaving com.wwsoft.spring.aop.Application.test.");
	}
		
	public static void main(String[] args) {

		ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(MyAOPConfig.class);
		Application app = applicationContext.getBean(Application.class);
		app.test(); 
;		System.out.println("Leaving com.wwsoft.spring.aop.Application.main.");
	}
}
