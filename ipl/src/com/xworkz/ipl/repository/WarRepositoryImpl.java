package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exception.ArrayisfullnowDontAddMore;


public class WarRepositoryImpl implements WarRepository{
	
	WarDTO[] warDto=new WarDTO[10];
	private int currentIndex=0;
	
	@Override
	public boolean Create(WarDTO warDTO) {
		System.out.println("running create of WarDTO"+warDTO);
		if(this.currentIndex>=warDto.length) {
			System.err.println("size exceeded cannot add more War");
			throw new ArrayisfullnowDontAddMore();
			
		}
		this.warDto[this.currentIndex]=warDTO;
		System.out.println("save"+"in index"+this.currentIndex);
		this.currentIndex++;
		return false;
		
	}
	@Override
	public WarDTO findStartedBy(String tempWarName) {
		for(WarDTO warDTO :warDto) {
			
			if(warDTO!=null&& warDTO.getStartedBy().equals(tempWarName)) {
				
				System.out.println(tempWarName);
    			System.out.println("The following the properties are match");
    			System.out.println(warDTO);
			}
		
			
		}
		return WarRepository.super.findStartedBy(tempWarName);
	}
	

}
