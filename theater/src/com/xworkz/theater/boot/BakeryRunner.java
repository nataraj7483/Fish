package com.xworkz.theater.boot;

import com.xworkz.theater.dto.BakeryDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.BakeryRepository;
import com.xworkz.theater.repository.BakeryRepositoryImpl;
import com.xworkz.theater.service.BakeryService;
import com.xworkz.theater.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {
		
		BakeryDTO dto = new BakeryDTO("RajBakery","Raj","Hosadurga","HoneyCake",87698);
		
		BakeryRepository bakeryRepository =new BakeryRepositoryImpl();

		BakeryService service = new BakeryServiceImpl(bakeryRepository);
		
		try {
			System.out.println("Before calling validate and Save");
			service.validateAndSave(dto);
			System.out.println("After calling validate and save");
		}
		catch(InvalidDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch block...");
	}

}
