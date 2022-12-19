package com.xworkz.theater.repository;

import com.xworkz.theater.dto.RailwayStationDTO;
import com.xworkz.theater.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository{

	RailwayStationDTO[] dto = new RailwayStationDTO[5];
	private int currentIndex=0;
	
	@Override
	public boolean store(RailwayStationDTO dto) {
		
		if(this.currentIndex >=this.dto.length) {
			System.err.println("size exceeded cannot be add more RailwayStationDTO");
			throw new StorageFullException();
		}
		this.dto[this.currentIndex]=dto;
		currentIndex++;
		return false;
	}
	

}
