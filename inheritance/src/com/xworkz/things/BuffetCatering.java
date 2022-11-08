package com.xworkz.things;

public class BuffetCatering extends Catering{
	
	public BuffetCatering() {
		
	}
	 public BuffetCatering(String cateringName,String cateringOwner,String cateringLocation) {
		
		this.cateringName=cateringName;
		this.cateringOwner=cateringOwner;
		this.cateringLocation=cateringLocation;
	
	}
	public void print() {
		System.out.println(cateringName);
		System.out.println(cateringOwner);
		System.out.println(cateringLocation);
		
	}
	


}
