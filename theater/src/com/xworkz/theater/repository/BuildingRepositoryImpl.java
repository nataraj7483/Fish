package com.xworkz.theater.repository;

import com.xworkz.theater.dto.BuildingDTO;
import com.xworkz.theater.exception.StorageFullException;

public class BuildingRepositoryImpl implements BuildingRepository{

	BuildingDTO[] dto = new BuildingDTO[5];
	private int currentIndex=0;
	
	
	@Override
	public boolean store(BuildingDTO dto) {
		if(this.currentIndex>=this.dto.length) {
			System.err.println("size exceeded cannot be add more TheaterDTO");
			throw new StorageFullException();
		}
		this.dto[this.currentIndex]=dto;
		System.out.println("Saved dto into index:"+this.currentIndex);
		currentIndex++;
		return false;
	}

}
