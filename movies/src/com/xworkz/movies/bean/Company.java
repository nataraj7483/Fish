package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Location location;

	public Company() {
		System.out.println("Producer Started company...");

	}
	public void display() {
		System.out.println("company displays..");
		System.out.println("Company hash code is:"+ location.hashCode());
	}
	
}
