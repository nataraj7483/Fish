package com.xworkz.theater.boot;

import com.xworkz.theater.dto.RailwayStationDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.RailwayStationRepository;
import com.xworkz.theater.repository.RailwayStationRepositoryImpl;
import com.xworkz.theater.service.RailwayStationService;
import com.xworkz.theater.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {
		
		RailwayStationDTO dto = new RailwayStationDTO("Kuvempu Express",20,"Majestic",120);
		
		RailwayStationRepository railwayStationRepository = new RailwayStationRepositoryImpl();
        
	    RailwayStationService service = new RailwayStationServiceImpl(railwayStationRepository);
		
		try {
			System.out.println("Before calling validate and save");
			boolean saved=service.validDateAndSave(dto);
			System.out.println("After calling validate and save");
		}
		catch(InvalidDataException e) {
			e.printStackTrace();
			
		}
		System.out.println("After catch Block..");
	}

}
