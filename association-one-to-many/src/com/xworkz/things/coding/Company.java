package com.xworkz.things.coding;

public class Company {
	
	public String name;
	public String ownerName;
	public Address address=new Address();
	
	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	public Company() {
		
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
	}
	 
	

}
