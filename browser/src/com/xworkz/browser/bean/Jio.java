package com.xworkz.browser.bean;

import org.springframework.stereotype.Component;

import com.xworkz.browser.rule.Provider;

@Component
public class Jio implements Provider {

	public Jio() {
		System.out.println("deafult constractor of jio");
	}
	
	@Override
	public void connect() {

		System.out.println("running connect in to jio...");
		
	}

}
