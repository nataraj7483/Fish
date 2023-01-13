package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {

	@Autowired
	private Area area;

	public Location() {
		System.out.println("Location Gandinagar ..");
	}
	public void display() {
		System.out.println("location displayes..");
		System.out.println("Area hash code is:"+ area.hashCode());
	}
	
}
