package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistance {
	@Autowired
	private Company company;

	public Assistance() {
		
	}
	
	public void display() {
		System.out.println("Assistance display..");
		System.out.println("Assistance hash code is :" +company.hashCode());

	}

}
