package com.xworkz.nataraj.configuaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.nataraj")
public class NatarajConfiguaration {
	
	public NatarajConfiguaration() {
		System.out.println("Running Confuguration...");
	}

}
