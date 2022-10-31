package com.xworkz.things.coding;

public class Country {
	
	public String name;
	public String president;
	public int noOfStates;
	public int noOfCM;
	
	public Country(String name, String president, int noOfStates, int noOfCM) {
		super();
		this.name = name;
		this.president = president;
		this.noOfStates = noOfStates;
		this.noOfCM = noOfCM;
	}
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.president);
		System.out.println(this.noOfStates);
		System.out.println(this.noOfCM);
	}

}
