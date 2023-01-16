package com.xworkz.browser.bean;


import org.springframework.stereotype.Component;

import com.xworkz.browser.rule.Browser;


@Component
public class Chrome implements Browser{

	
	public Chrome() {
		
		System.out.println("Default constructor of chrome");
	}
	
	@Override
	public void browse() {
		System.out.println("running browser...");
		
	}

}
