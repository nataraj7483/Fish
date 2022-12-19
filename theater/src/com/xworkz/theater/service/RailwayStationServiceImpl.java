package com.xworkz.theater.service;

import com.xworkz.theater.dto.RailwayStationDTO;
import com.xworkz.theater.exception.InvalidDataException;
import com.xworkz.theater.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService{

	private RailwayStationRepository railwayStationRepository;
	
	public RailwayStationServiceImpl(RailwayStationRepository railwayStationRepository) {
		this.railwayStationRepository=railwayStationRepository;
	}
	
	@Override
	public boolean validDateAndSave(RailwayStationDTO dto) throws InvalidDataException {
		System.out.println("Running Validate and Save:"+ dto);
		String name=dto.getName();
	    int noOfPlatforms=dto.getNoOfPlatforms();
		String area=dto.getArea();
		int platformTicket=dto.getPlatformTicket();
		
		boolean validName=false;
		boolean validNoOfPlatforms=false;
		boolean validArea=false;
		boolean validPlatformTicket=false;
		
		if(name!=null &&name.length()>=4 && name.length()<20) {
			System.out.println("Valind railwayStation name:"+name);
			return true;
		}else {
			System.out.println("Invalid RailwayStation nmame :"+name);
		}
		if(noOfPlatforms>=4) {
			System.out.println("Valind railwayStation noOfPlatforms:"+noOfPlatforms);
			return true;
		}else {
			System.out.println("Invalid RailwayStation noOfPlatforms :"+noOfPlatforms);
		}
		if(area!=null &&area.length()>=4 && area.length()<20) {
			System.out.println("Valind railwayStation area:"+area);
			return true;
		}else {
			System.out.println("Invalid RailwayStation nmame :"+area);
		}
		if(platformTicket>=4) {
			System.out.println("Valind railwayStation platformTicket:"+platformTicket);
			return true;
		}else {
			System.out.println("Invalid RailwayStation platformTicket :"+platformTicket);

		}
		if(validName && validNoOfPlatforms && validArea && validPlatformTicket) {
			System.out.println("Data is invalid can store");
			boolean saved=this.railwayStationRepository.store(dto);
			System.out.println("Data is saved succesfully:"+dto);
			return saved;
		}
		
		throw new InvalidDataException("Check the Data U have passed");
	}
	
	

}
