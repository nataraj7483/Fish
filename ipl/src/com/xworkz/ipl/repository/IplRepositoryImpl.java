package com.xworkz.ipl.repository;

import javax.management.RuntimeErrorException;

import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository {
	
	private IplDTO[] iplDTO=new IplDTO[10];
	private int currentIndex=0;
	

	@Override
	
	public boolean create(IplDTO dto) {
		System.out.println("running create of iplDTO"+dto);
		if(this.currentIndex >=this.iplDTO.length) {
			System.err.println("size exceeded cannot add more iplteam");
			 throw new RuntimeErrorException(null);

			//return false;
		}
		this.iplDTO[this.currentIndex]=dto;
		System.out.println("save"+dto+"in index"+this.currentIndex);
		this.currentIndex++;
		return true;
	}
	
	

}
