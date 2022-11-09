package com.xworkz.overriding;

public class ShopingMall {
	
	public String name;
	public String location;
	
	public ShopingMall(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.location);
	}
	

}
