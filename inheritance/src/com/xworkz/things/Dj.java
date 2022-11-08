package com.xworkz.things;

public class Dj {

	public String djName;
	public String noOfDjs;
	public long price;
	public Dj() {
		System.out.println("Created default constructor of DJ class");
	}
	public Dj(String djName,String noOfDjs,long price) {
		super();  
		this.djName=djName;
		this.noOfDjs=noOfDjs;
		this.price=price;
		System.out.println("Created parameterised constuctor of DJ class");
	}
}
