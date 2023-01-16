package com.xworkz.browser.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.browser")
public class BrowserConfiguration {
	
	public BrowserConfiguration() {
		System.out.println("default constractor of browserConfiguration..");
	}

}
