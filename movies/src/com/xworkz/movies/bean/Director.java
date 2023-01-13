package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Experience experience;
	@Autowired
	private Skill skill;
	
	
	public Director() {
	
	}
	public void display() {
		System.out.println("Director Display...");
		System.out.println("Experience hash code is :"+ experience.hashCode());
		System.out.println("Skill hash code is :"+ skill.hashCode());

	}
	
	

}
