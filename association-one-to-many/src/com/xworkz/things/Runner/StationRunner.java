package com.xworkz.things.Runner;

import com.xworkz.things.coding.PoliceStation;
import com.xworkz.things.coding.Station;

public class StationRunner {

	public static void main(String[] args) {
	
		Station station=new Station();
		PoliceStation policeStation=new PoliceStation(10,5,"RudraPrathp","Raj",10,2,"Simha",12,3);

		station.usePoliceStation(policeStation);
		
		policeStation.showOff();

	}

}
