package com.xworkz.theater.service;

import com.xworkz.theater.dto.BakeryDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService{

	private BakeryRepository bakeryRepository;
	
	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		this.bakeryRepository=bakeryRepository;
	}
	
	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidDataException {
		System.out.println("Running validateAndSave:"+dto);
		String name=dto.getName();
		String ownerName=dto.getOwnerName();
		String location=dto.getLocation();
		String famousFor=dto.getFamousFor();
		long contactNo=dto.getContactNo();
		
		boolean validName=false;
		boolean validOwnerName=false;
		boolean validLocation=false;
		boolean validFamousFor=false;
		boolean validContactNo=false;
		
		if(name!=null && name.length()>=4 && name.length()<20) {
			System.out.println("Name is valid:"+ name);
			return true;
		}else {
			System.err.println("Name is Invalid:"+name);
		}
		if(ownerName!=null && ownerName.length()>=4 && ownerName.length()<20) {
			System.out.println("ownerName is valid:"+ ownerName);
			return true;
		}else {
			System.err.println("ownerName is Invalid:"+ownerName);
		}
		if(location!=null && location.length()>=4 && location.length()<20) {
			System.out.println("location is valid:"+ location);
			return true;
		}else {
			System.err.println("location is Invalid:"+location);
		}
		if(famousFor!=null && famousFor.length()>=4 && famousFor.length()<20) {
			System.out.println("famousFor is valid:"+ famousFor);
			return true;
		}else {
			System.err.println("famousFor is Invalid:"+famousFor);
		}
		if(contactNo>=4) {
			System.out.println("contact No is valid:"+contactNo);
			return true;
		}else {
			System.err.println("contact is Invalid:"+contactNo);
		}
		if(validName && validOwnerName && validLocation && validFamousFor && validContactNo ) {
			System.out.println("Data is valid can store");
			boolean saved =this.bakeryRepository.store(dto);
			System.out.println("data is saved succesfully:"+saved);
			return saved;
		}
		
		throw new InvalidDataException("Check the Data U have passed");
	}
	
	

}
