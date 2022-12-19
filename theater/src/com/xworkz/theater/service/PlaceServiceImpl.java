package com.xworkz.theater.service;

import com.xworkz.theater.dto.PlaceDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService{

	private PlaceRepository placeRepository ;
	
	public PlaceServiceImpl(PlaceRepository placeRepository) {
		this.placeRepository=placeRepository;
	}
	
	@Override
	public boolean validDateAndSave(PlaceDTO dto) throws InvalidDataException {
		String name=dto.getName();
		String famousFor=dto.getFamousFor();
		String famousTemple=dto.getFamousTemple();
		double distance=dto.getDistance();
		String famousHotel=dto.getFamousHotel();
		
		boolean validName=false;
		boolean validFamousFor=false;
		boolean validFamousTemple=false;
		boolean validDistance=false;
		boolean validFamousHotel=false;
		
		if(name!=null && name.length()>=4 && name.length()<20) {
			System.out.println("Valid Place name:"+name);
			return true;
		}else {
			System.out.println("Invalid place name:"+name);
		}
		if(famousFor!=null && famousFor.length()>=4 && famousFor.length()<20) {
			System.out.println("Valid Place famousFor:"+famousFor);
			return true;
		}else {
			System.out.println("Invalid place famousFor:"+famousFor);
		}
		if(famousTemple!=null && famousTemple.length()>=4 && famousTemple.length()<20) {
			System.out.println("Valid Place famousTemple:"+famousTemple);
			return true;
		}else {
			System.out.println("Invalid place famousTemple:"+famousTemple);
		}
		if(distance>=4) {
			System.out.println("Valid Place distance:"+distance);
			return true;
		}else {
			System.out.println("Invalid place distance:"+distance);
		}
		if(famousHotel!=null && famousHotel.length()>=4 && famousHotel.length()<20) {
			System.out.println("Valid Place famousHotel:"+famousHotel);
			return true;
		}else {
			System.out.println("Invalid place famousHotel:"+famousHotel);
		}
		if(validName && validFamousFor && validFamousTemple && validDistance && validFamousHotel) {
			System.out.println("Data is invalid can store");
			boolean saved= this.placeRepository.store(dto);
			System.out.println("Data is saved succesfully:"+dto);
			return saved;
		}
		
		throw new InvalidDataException("Check the Data U have passed");
	}
  
	
}
