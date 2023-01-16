package com.xworkz.browser.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.browser.rule.Browser;
import com.xworkz.browser.rule.Provider;

@Component
public class FireBox implements Browser {

	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	public FireBox() {
		
		System.out.println("default constructor of firebox");
	}
	
	@Override
	public void browse() {

		System.out.println("running browser in chrome..");
		provider.connect();
	}

}
