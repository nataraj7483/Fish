package com.xworkz.things.Runner;


import com.xworkz.things.coding.Photo;
import com.xworkz.things.coding.PhotoGraper;


public class PhotoGraperRunner {

	public static void main(String[] args) {
		
		PhotoGraper photoGraper=new PhotoGraper();
		Photo photo=new Photo(10,8,true,5,"core","Boosted",500,"10clicks per sec");

		photoGraper.usePhoto(photo);
		
		photo.showOff();


	}

}
