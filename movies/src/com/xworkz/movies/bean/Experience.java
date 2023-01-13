package com.xworkz.movies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill;

	public Experience() {
		System.out.println("Director Have Script writing Skills..");
	}
	public void display() {
		System.out.println("Expiriance displays..");
		System.out.println("Expiriance hash code is :"+ skill.hashCode());
	}
	

}
