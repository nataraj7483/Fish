package com.xworkz.theater.repository;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.exception.StorageFullException;

public class TheaterRepositiryImpl implements TheaterRepository{

	private TheaterDTO[] dtos =new TheaterDTO[5];
	private int google=0;
	
	
	@Override
	public boolean store(TheaterDTO dto) {
		if(this.google >=this.dtos.length) {
			System.err.println("size exceeded cannot be add more TheareDTO");
			throw new StorageFullException();
		}
		this.dtos[this.google]=dto;
		System.out.println("Saved dto into index:"+this.google);
		this.google++;
		return false;
	}
	
	

}
