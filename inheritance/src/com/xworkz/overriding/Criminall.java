package com.xworkz.overriding;

public class Criminall {
	
	public String crime;
	public int noOfCrime;
	
	public Criminall(String crime, int noOfCrime) {
		super();
		this.crime = crime;
		this.noOfCrime = noOfCrime;
	}
	public void display() {
		System.out.println(this.crime);
		System.out.println(this.noOfCrime);
	}
	

}
