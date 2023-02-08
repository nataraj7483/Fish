package com.xworkz.bakery.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class BakeryConfiguration {
	
	public BakeryConfiguration() {
		System.out.println("Running BakeryConfiguration");
		
	}
	
	@Bean
	public ViewResolver onViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	

}
