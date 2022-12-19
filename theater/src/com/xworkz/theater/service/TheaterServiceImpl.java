package com.xworkz.theater.service;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.exception.InvalidDataException;

import com.xworkz.theater.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService{

	private TheaterRepository theaterRepository;
	 
	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		this.theaterRepository=theaterRepository;
	}
	
	
	@Override
	public boolean validDateAndSave(TheaterDTO dto) throws InvalidDataException{
		
		System.out.println("Running Validate and Save:"+ dto);
		int id=dto.getId();
		String name=dto.getName();
		String brand=dto.getBrand();
		int seats=dto.getSeats();
		boolean validId=false;
		boolean validName=false;
		boolean validBrand=false;
		boolean validSeats=false;
		
		if(id>=2) {
			System.out.println("Valid theater Id:"+ id);
			return true;
		}
		else {
			System.err.println("Invlid theater Id:" +id);
		}
		if(name!=null &&name.length()>=3 && name.length()<=20) {
			System.out.println("Valid theater Name:"+ name);
			return true;
		}
		else {
			System.out.println("In valid Name:"+ name);
		}
		if(brand!=null &&brand.length()>=3 && brand.length()<=20) {
			System.out.println("Valid theater Name:"+ brand);
			return true;
		}
		else {
			System.err.println("In valid Name:"+ brand);
		}
		if(seats>3 && seats<=700) {
			System.out.println("Valid theater seats:"+seats);
			return true;
		}
		else {
			System.err.println("In valid theater seats:"+ seats);
		}
		if(validId && validName && validBrand && validSeats) {
			System.out.println("Data is invalid can store");
			boolean saved = this.theaterRepository.store(dto);
			System.out.println("Data is saved succesfully:"+ saved);
			return saved;
			
		}
		throw new InvalidDataException("Check the Data U have passed");
	}
	
}
		
		
		
		
		