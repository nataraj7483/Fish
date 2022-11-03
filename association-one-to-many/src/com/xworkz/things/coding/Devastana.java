package com.xworkz.things.coding;

public class Devastana {
	
public Temple temple;
	
	public void useTemple(Temple temple) {
		
		System.out.println(temple);
		System.out.println(temple.noOfBhakts);
		System.out.println(temple.noOfVersion);
		System.out.println(temple.timing);
		System.out.println(temple.getName());
		temple.setName("Andra Tirupathi");
		
		System.out.println("after modifying:"+temple.getName());
		
		System.out.println(temple.getTrust());
		temple.setTrust("Thimappa");
		
		System.out.println("after modifying:"+temple.getTrust());
	}




}
