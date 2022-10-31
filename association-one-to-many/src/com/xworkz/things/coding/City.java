package com.xworkz.things.coding;

public class City {
	
	public String name;
	public String mpCandidateName;
	public int pinCode;
	public String templeName;
	
	public City(String name, String mpCandidateName, int pinCode, String templeName) {
		super();
		this.name = name;
		this.mpCandidateName = mpCandidateName;
		this.pinCode = pinCode;
		this.templeName = templeName;
	}
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.mpCandidateName);
		System.out.println(this.pinCode);
		System.out.println(this.templeName);
		
	}
	
	

}
