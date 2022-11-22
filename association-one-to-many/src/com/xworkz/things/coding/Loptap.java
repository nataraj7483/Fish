package com.xworkz.things.coding;

public class Loptap {
	
	String name;
	String brand;
	
	public String display(String name) {
		this.name=name;
		System.out.println(this.name);
		return "name";
	}
	public void display(String name,String brand) {
		this.name=name;
		this.brand=brand;
		System.out.println(this.name);
		System.out.println(this.brand);
	}

	
	
	
}
