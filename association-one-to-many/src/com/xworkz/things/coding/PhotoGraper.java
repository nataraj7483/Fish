package com.xworkz.things.coding;

public class PhotoGraper {
	
public Photo photo;
	
	public void usePhoto(Photo photo) {
		
		System.out.println(photo);
		System.out.println(photo.series);
		System.out.println(photo.noOfVersion);
		System.out.println(photo.readiator);
		System.out.println(photo.getName());
		photo.setName("Andra Tirupathi");
		
		System.out.println("after modifying:"+photo.getName());
		
		System.out.println(photo.getCompany());
		photo.setCompany("Thimappa");
		
		System.out.println("after modifying:"+photo.getCompany());
	}


}
