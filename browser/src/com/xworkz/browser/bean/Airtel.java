package com.xworkz.browser.bean;

import org.springframework.stereotype.Component;

import com.xworkz.browser.rule.Provider;

@Component
public class Airtel implements Provider {

	public Airtel() {
		System.out.println("Default constractor os airtel");
	}
	
	@Override
	public void connect() {
		
		System.out.println("running connect...");

	}

}
