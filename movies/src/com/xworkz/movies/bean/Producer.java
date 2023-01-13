package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistance assistance;

	public Producer() {
		System.out.println("producer started produce movie.");
		
	}
	public void display() {
		System.out.println("Producer display...");
		System.out.println("Producer hash code is:" +assistance.hashCode());
	}
	

}
