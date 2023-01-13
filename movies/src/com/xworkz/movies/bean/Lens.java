package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	
	@Autowired
	private Battery battery;

	public Lens() {
		
	}
	public void display() {
		System.out.println("Lens Displays..");
		System.out.println("Battery hash code is:"+ battery.hashCode());
	}
	

}
