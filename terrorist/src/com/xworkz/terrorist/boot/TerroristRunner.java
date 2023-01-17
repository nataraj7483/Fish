package com.xworkz.terrorist.boot;

import java.time.LocalDateTime;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImpl;

public class TerroristRunner {

	public static void main(String[] args) {

		TerroristDTO dto = new TerroristDTO();
		dto.setName("Manu S P Gowda");
		dto.setAge(24);
		dto.setCountry("Uganda");
		dto.setAlive(true);
	   dto.setOrganization("Akshay");
	   dto.setPrison(true);
	   dto.setSpecialization("Killer");
	   dto.setCreatedAt(LocalDateTime.now());
	   dto.setUpdatedAt(LocalDateTime.now());
	   dto.setCreatedBy("Nataraj");
	   dto.setUpdatedBy("Nataraj");
	   System.out.println(dto);
		
		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(dto);
		
	}

}
