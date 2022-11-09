package com.xworkz.overriding;

public class MeenakshiMall extends ShopingMall {
	
	public int noOfGates;
	
	public MeenakshiMall(String name,String location,int noOfGates) {
		super(name,location);
		this.noOfGates= noOfGates;
		
	}
	public void display() {
		super.display();
		System.out.println(noOfGates);
	}
	

}
