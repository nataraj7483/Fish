package com.xworkz.theater.boot;

import com.xworkz.theater.constant.BuildingType;
import com.xworkz.theater.dto.BuildingDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.BuildingRepository;
import com.xworkz.theater.repository.BuildingRepositoryImpl;
import com.xworkz.theater.service.BuildingService;
import com.xworkz.theater.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		
		BuildingDTO dto = new BuildingDTO(12,"Brundava",120,true,true,BuildingType.BUNGALOW);
		
		BuildingRepository buildingRepository = new BuildingRepositoryImpl();
		
		BuildingService service = new BuildingServiceImpl(buildingRepository);
		
		try {
			System.out.println("Before Calling Validate and Save");
			boolean saved= service.validDateAndSave(dto);
			System.out.println("After calling validate and save");
		}
		catch(InvalidDataException e){
			e.printStackTrace();
			
		}
		System.out.println("After catch Block..");
	}

}
