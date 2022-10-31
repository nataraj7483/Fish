package com.has.coding.code;

public class Company {
	
	public String name;
	public String type;
	
	public Company(String name,String type) {
		this.name=name;
		this.type=type;
	}
	public void startCompany() {
		System.out.println("invoking close company");
	}
	public void closeCompany() {
		System.out.println("invoking close company");
	}
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.type);
	}

}
