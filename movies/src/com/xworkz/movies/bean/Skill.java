package com.xworkz.movies.bean;

import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	public Skill() {
		System.out.println("Skill is Running..");
	}
	public void display() {
		System.out.println("Director Skill...");
	}

}
