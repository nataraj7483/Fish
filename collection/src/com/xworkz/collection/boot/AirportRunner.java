package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {

		AirportDTO dto1 = new AirportDTO("Kempegowda International Airport",5237,"Indian Airlines");
		AirportDTO dto2 = new AirportDTO("Hubballi Airport",5238,"Jet Airways");
		AirportDTO dto3 = new AirportDTO("Mangaluru International Airport",5239,"AirAsia");
		AirportDTO dto4 = new AirportDTO("Kalaburagi Airport",5210,"Pawan Hans");
		AirportDTO dto5 = new AirportDTO("Kempegowda International Airport",5211,"Indian Airlines");

		boolean equals = dto1.equals(dto5)	;
		System.out.println(equals);
		Collection<AirportDTO> airport= new ArrayList<AirportDTO>();
		airport.add(dto1);
		airport.add(dto2);

		boolean contains = airport.contains(dto5);
		System.out.println("contains:"+contains);
		
	}

}
