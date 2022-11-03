package com.xworkz.things.Runner;

import com.xworkz.things.coding.Space;
import com.xworkz.things.coding.SpaceStation;

public class SpaceStationRunner {

	public static void main(String[] args) {
		
		SpaceStation station = new SpaceStation();
		Space Space = new Space();
		System.out.println(Space.getWeight());
		System.out.println(Space.getName());
		System.out.println(Space.getCountry());
		System.out.println(Space.getNoOfDocking());
		System.out.println(Space.getHabitaleVolume());
		System.out.println(Space. getAstronauts());
		System.out.println(Space. isMorePower());
		System.out.println(Space. getSpaceCraftName());
		   System.out.println(Space.getGravity());
		   System.out.println(Space.getLength());
		   System.out.println(Space.getOrganisation());
		   System.out.println(Space.getWeight());
		
		 System.out.println(System.lineSeparator());  
		  
		 station.galaxy(Space);
		
	} 

	}



