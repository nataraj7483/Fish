package com.xworkz.browser.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.browser.bean.FireBox;
import com.xworkz.browser.configuration.BrowserConfiguration;
import com.xworkz.browser.rule.Browser;

public class BrowserRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		
		Browser browser=	context.getBean(FireBox.class);  // abstraction
		browser.browse();
			
		
		
	}

}
