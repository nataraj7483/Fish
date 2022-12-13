package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;


public class WarRepositoryImpl implements WarRepository{
	
	WarDTO[] warDto=new WarDTO[10];
	private int currentIndex=0;
	
	@Override
	public boolean Create(WarDTO warDTO) {
		System.out.println("running create of WarDTO"+warDTO);
		if(this.currentIndex>=warDto.length) {
			System.err.println("size exceeded cannot add more War");
			
		}
		this.warDto[this.currentIndex]=warDTO;
		System.out.println("save"+warDto.toString()+"in index"+this.currentIndex);
		this.currentIndex++;
		return false;
		
	}
	@Override
	public WarDTO tempWar(String tempWarName) {
		for(WarDTO warDTO :warDto) {
			String tempName=warDTO.getCreatedBy();
			if(warDTO!=null&& tempName.equals(tempWarName)) {
				
				System.out.println(tempWarName);
    			System.out.println("The following the properties are match");
    			System.out.println(warDTO);
    			return warDTO;
			}
		
			
		}
		return WarRepository.super.tempWar(tempWarName);
	}
	

}
