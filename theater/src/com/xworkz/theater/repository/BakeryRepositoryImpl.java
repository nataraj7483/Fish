package com.xworkz.theater.repository;

import com.xworkz.theater.dto.BakeryDTO;
import com.xworkz.theater.exception.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository{

	BakeryDTO[] dto = new BakeryDTO[5];
	private int currentIndex=0;
	
	@Override
	public boolean store(BakeryDTO dto) {
		System.out.println("Running store:"+ dto);
		if(this.currentIndex>=this.dto.length) {
			System.out.println("Cannot add more Bakery");
			throw new StorageFullException();
			
		}
		this.dto[this.currentIndex]=dto;
		System.out.println("saved dto into index:"+ this.currentIndex);
		currentIndex++;
		return false;
	}
	
	

}
