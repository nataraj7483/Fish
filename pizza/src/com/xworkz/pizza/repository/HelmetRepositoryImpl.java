package com.xworkz.pizza.repository;

import javax.management.RuntimeErrorException;

import com.xworkz.pizza.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository{

	HelmetDTO[] dto=new HelmetDTO[5];
	private int currentIndex=0;
	
	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("Running saved HelmetDTO:"+ dto);
		if(this.currentIndex >=this.dto.length) {
			System.err.println("size exceeded cannot add more HelmetDTO");
			 throw new RuntimeErrorException(null);

		}
		this.dto[this.currentIndex]=dto;
		System.out.println("save"+dto.toString()+"in index"+this.currentIndex);
		this.currentIndex++;
		
		return false;
	}
	
	

}
