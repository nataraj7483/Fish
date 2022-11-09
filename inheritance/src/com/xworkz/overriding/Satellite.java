package com.xworkz.overriding;

public class Satellite {
	
	public String name;
	public double expenditure;
	
	public Satellite(String name, double expenditure) {
		super();
		this.name = name;
		this.expenditure = expenditure;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.expenditure);
	}
	

}
