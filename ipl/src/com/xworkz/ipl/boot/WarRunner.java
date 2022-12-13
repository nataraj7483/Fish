package com.xworkz.ipl.boot;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryImpl;

public class WarRunner {
	
	public static void main(String[] arg) {
		
		WarRepository warRepositiry =new WarRepositoryImpl();
		WarDTO warDTO =new WarDTO();
		
		warDTO.setEndDate(1999);
		warDTO.setName("India vs Pakistan");
		warDTO.setNoOfDeaths(230000);
		warDTO.setStartDate(1999);
		warDTO.setStartedBy("Pakistan");
		warDTO.setWonBy("India");
		warDTO.setStartedWith("Pakistan");
		warDTO.setCreatedBy("Hosama Binladon");
		warDTO.setUpdatedBy("Raj");
	
		warRepositiry.Create(warDTO);
		
		warRepositiry.tempWar("India");
		
	}

}
