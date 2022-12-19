package com.xworkz.theater.repository;

import com.xworkz.theater.dto.PlaceDTO;
import com.xworkz.theater.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository{

	PlaceDTO[] dto = new PlaceDTO[5];
	private int currentIndex=0;
	
	
	@Override
	public boolean store(PlaceDTO dto) {
		System.out.println("Running Store:"+dto);
		if(this.currentIndex>=this.dto.length) {
			System.err.println("size exceeded cannot be add more PlaceDTO");
			throw new StorageFullException();
		}
		this.dto[this.currentIndex]=dto;
		currentIndex++;
		
		return false;
	}
	
	

}
