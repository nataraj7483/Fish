package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	@Autowired
	private Capacity capacity;

	public Battery() {
		System.out.println("Battery running..");
	}
	public void display() {
		System.out.println("Capacity displays..");
		System.out.println("Capacity hash code:"+ capacity.hashCode());
	}
	

}
