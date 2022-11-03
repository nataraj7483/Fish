package com.xworkz.things.Runner;

import com.xworkz.things.coding.ElectricBike;
import com.xworkz.things.coding.ElectricBikeAccess;

public class ElectricBikeRunner {

	public static void main(String[] args) {
		
		ElectricBike car = new ElectricBike();
		ElectricBikeAccess acc = new ElectricBikeAccess();
		
		
		acc.elonMusk(car);
		
		System.out.println(System.lineSeparator());
		
		System.out.println(car.getName());
		System.out.println(car.getSeries());
		System.out.println(car.getCompany());
		System.out.println(car.getNoOfVersion());
		System.out.println(car.isReadiator());
		System.out.println(car.getMilage());
		
		System.out.println(car.getAi());
		System.out.println(car.getBattery());
		System.out.println(car.getSpeed());
		System.out.println(car.getSpeed());
		
		
		
		
		
		

	}

}
