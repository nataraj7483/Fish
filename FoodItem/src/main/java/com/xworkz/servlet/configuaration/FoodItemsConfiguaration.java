package com.xworkz.servlet.configuaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.servlet")
public class FoodItemsConfiguaration {
	public FoodItemsConfiguaration() {
		System.out.println("Running " + getClass().getSimpleName());
	}

}
