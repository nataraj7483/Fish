package com.xworkz.boot;

import com.xworkz.things.equales.Vehicles;

public class VehicleRunner {

	public static void main(String[] args) {

		Vehicles vehicles=new Vehicles("Toyata","Toyata Avalon",65766565,"Red",4,true,6,"toyata cars",5,4);
	    System.out.println(vehicles);
	    
	    Vehicles vehicles1 = new Vehicles("Nexon","tata",766757545,"RED",4,true,5,"tata cars",5,5);
		System.out.println(vehicles1);
	    
	    boolean abcd=vehicles.equals(vehicles1);
	    System.out.println(abcd);
	}

}
