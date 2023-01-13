package com.xworkz.movies.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.movies")
public class MovieConfiguration {
	
	public MovieConfiguration() {
		System.out.println("MovieConfiguration Running..");
	}

}
