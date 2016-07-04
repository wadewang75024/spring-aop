package com.wwsoft.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPLogger {	
	
	@Autowired
	Module module;
	
	@Before("execution(* com.wwsoft.spring.aop.Module.dummy(..)) && args(msg)")
	public void logBefore(JoinPoint joinPoint, String msg) {
		System.out.println("#####AOPLogger##### logBefore() is running!");
		System.out.println("#####AOPLogger##### HiJacked : " + joinPoint.getSignature().getName());
		System.out.println("#####AOPLogger##### " + msg);
		System.out.println("#####AOPLogger##### " + module.getValue());
		module.setValue(666);
	}
}
