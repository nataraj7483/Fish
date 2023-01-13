package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;

	public Movie() {

		System.out.println("Direction Started..");

	}

	public void Moviedisplay() {
		System.out.println("Movie Display..");
		System.out.println("Director Hash Code is   : " + director.hashCode());
		System.out.println("Producer Hash Code is   : " + producer.hashCode());

	}
	
	

}
