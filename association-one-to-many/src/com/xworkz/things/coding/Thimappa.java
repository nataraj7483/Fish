package com.xworkz.things.coding;

public class Thimappa {
	
public Tirupathi tirupathi;
	
	public void useTirupathi(Tirupathi tirupathi) {
		
		System.out.println(tirupathi);
		System.out.println(tirupathi.noOfPoojari);
		System.out.println(tirupathi.noOfsecurity);
		System.out.println(tirupathi.poojariName);
		System.out.println(tirupathi.getPlace());
		tirupathi.setPlace("Andra Tirupathi");
		
		System.out.println("after modifying:"+tirupathi.getPlace());
		
		System.out.println(tirupathi.getGodName());
		tirupathi.setGodName("Thimappa");
		
		System.out.println("after modifying:"+tirupathi.getGodName());
	}



}
