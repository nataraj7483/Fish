package com.xworkz.overriding;

public class Director {
	
	public String name;
	public String directionOf;
	
	public Director(String name, String directionOf) {
		super();
		this.name = name;
		this.directionOf = directionOf;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.directionOf);
	}

}
