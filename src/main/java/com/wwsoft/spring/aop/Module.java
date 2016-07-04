package com.wwsoft.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.wwsoft.logger.MyLogger;

@Component
public class Module {
	
	Integer value;
	
	@Autowired  
    public Module(@Value("#{new Integer(-1)}")final int value) {   
         this.value = value;  
    }  
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void dummy(String msg) {
		System.out.println("#####Module.dummy##### starts...");
		System.out.println("#####Module.dummy##### The message: " + msg);
		System.out.println("#####Module.dummy##### The value: " + value);
		System.out.println("#####Module.dummy##### end.");
	}
}
