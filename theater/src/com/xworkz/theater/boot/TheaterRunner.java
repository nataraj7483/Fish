package com.xworkz.theater.boot;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.exception.InvalidDataException;

import com.xworkz.theater.repository.TheaterRepositiryImpl;
import com.xworkz.theater.repository.TheaterRepository;
import com.xworkz.theater.service.TheaterService;
import com.xworkz.theater.service.TheaterServiceImpl;

public class TheaterRunner {
	
	public static void main(String[] arg) {
	
	TheaterDTO theaterDTO = new TheaterDTO(143,"Nataraj","Cineworld",250 );
	
	TheaterRepository repository = new TheaterRepositiryImpl();
	
	TheaterService theaterService = new TheaterServiceImpl(repository);
	
	try{
		System.out.println("Before calling validate and Save");
		boolean save =theaterService.validDateAndSave(theaterDTO);
		System.out.println("After calling validdate and save");
	}
	catch(InvalidDataException e) {
		e.printStackTrace();
	}
    System.out.println("After catch Block..");
    
	}
}


