package com.xworkz.theater.boot;

import com.xworkz.theater.dto.PlaceDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.PlaceRepository;
import com.xworkz.theater.repository.PlaceRepositoryImpl;
import com.xworkz.theater.service.PlaceService;
import com.xworkz.theater.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		
		PlaceDTO dto =new PlaceDTO("Hosadurga","Vaani Vilasa Sagara","Dhasharatha Rameshwara",120,"Mourya");
		
		PlaceRepository placeRepository = new PlaceRepositoryImpl();
		
		PlaceService service = new PlaceServiceImpl(placeRepository);
		
		try {
			System.out.println("Before Calling Validate and Save");
			boolean saved= service.validDateAndSave(dto);
			System.out.println("After calling validate and save");
		}
		catch(InvalidDataException e) {
			e.printStackTrace();
		}
		System.out.println("After catch Block..");
	}

}
