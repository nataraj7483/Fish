package com.xworkz.things.coding;

public class Durga {
	
	public Hosadurga hosadurga;
	
	public void useHosadurga(Hosadurga hosadurga) {
		
		System.out.println(hosadurga);
		System.out.println(hosadurga.noOfTq);
		System.out.println(hosadurga.mla);
		System.out.println(hosadurga.mp);
		System.out.println(hosadurga.getDistrictName());
		hosadurga.setDistrictName("Chitradurga");
		
		System.out.println("after modifying:"+hosadurga.getDistrictName());
		
		System.out.println(hosadurga.getTqName());
		hosadurga.setTqName("Hosadurga");
		
		System.out.println("after modifying:"+hosadurga.getTqName());
	}

}
