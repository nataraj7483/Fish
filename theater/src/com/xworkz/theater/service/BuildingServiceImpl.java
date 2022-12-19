package com.xworkz.theater.service;

import com.xworkz.theater.constant.BuildingType;
import com.xworkz.theater.dto.BuildingDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.BuildingRepository;


public class BuildingServiceImpl implements BuildingService{

	private BuildingRepository buildingRepository;
	
	public BuildingServiceImpl(BuildingRepository buldingReposotory) {
		this.buildingRepository=buildingRepository;
	}
	@Override
	public boolean validDateAndSave(BuildingDTO dto) throws InvalidDataException {
		
		System.out.println("Running validate and save:"+dto);
		int no=dto.getNo();
		String name = dto.getName();
		int floors= dto.getFloors();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		BuildingType type = dto.getType();
		
		boolean validNo=false;
		boolean validName=false;
		boolean validFloors=false;
		boolean validLift=false;
		boolean validParking=false;
		boolean validType=false;
		
		if(no >=2) {
			System.out.println("Valid Building NO:"+ no);
			return true;
		}else {
			System.out.println("Invalid Building No:"+ no);
		}
		if(name!=null && name.length()>=4 && name.length()<=25) {
			System.out.println("Valid Building Name:"+name);
			return true;
		}else {
			System.out.println("Invalid Building Name:"+name);
		}
		if(floors>=4) {
			System.out.println("Valid Building Floors:"+floors);
			return true;
		}else {
			System.out.println("Invalid Building Floors:"+floors);
		}
		if(lift!=false) {
			System.out.println("Valid Building Floors:"+ floors);
			return true;
		}else {
			System.out.println("Invalid Building Floors:"+ floors);
		}
		if(parking!=false) {
			System.out.println("Valid Building Parking:"+ parking);
			return true;
		}else {
			System.out.println("Invalid Building Parking:"+ parking);
		}
		if(type!=null && type.equals(type)) {
			System.out.println("Valid Building Type:"+ type);
		}else {
			System.out.println("Invalid Building type:"+type);
		}
		if(validNo && validName && validFloors && validLift && validParking && validType) {
			System.out.println("Data invalid can store");
			boolean saved=this.buildingRepository.store(dto);
			System.out.println("Data is saved succesfully :"+saved);
			return saved;
		}
		throw new InvalidDataException("Check the Data U have passed");
		
		
	}
	

}
