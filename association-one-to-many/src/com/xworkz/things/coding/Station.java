package com.xworkz.things.coding;

public class Station {

public PoliceStation policeStation;
	
	public void usePoliceStation(PoliceStation policeStation) {
		
		System.out.println(policeStation);
		System.out.println(policeStation.noOfpolice);
		System.out.println(policeStation.noOfCells);
		System.out.println(policeStation.SubInspector);
		System.out.println(policeStation.getArea());
		policeStation.setArea("Koramangla");
		
		System.out.println("after modifying:"+policeStation.getArea());
		
		System.out.println(policeStation.getStationName());
		policeStation.setStationName("KoramgalaPoliceStation");
		
		System.out.println("after modifying:"+policeStation.getStationName());
	}


}
