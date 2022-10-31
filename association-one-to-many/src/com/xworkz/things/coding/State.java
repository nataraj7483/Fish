package com.xworkz.things.coding;

public class State {

	public String name;
	public int noOfDistrict;
	public String cmName;
	public String capitalCity;
	
	public State(String name, int noOfDistrict, String cmName, String capitalCity) {
		super();
		this.name = name;
		this.noOfDistrict = noOfDistrict;
		this.cmName = cmName;
		this.capitalCity = capitalCity;
	}
	public void showOff() {
		
		System.out.println(this.name);
		System.out.println(this.noOfDistrict);
		System.out.println(this.cmName);
		System.out.println(this.capitalCity);
	}
	
	
}
