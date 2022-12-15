package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImpl;
import com.xworkz.pizza.service.HelmetService;
import com.xworkz.pizza.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		
		HelmetDTO dto = new HelmetDTO("Vega",750D, HelmetType.FULL, Color.BLACK);
		
		HelmetRepository helmetRepository = new HelmetRepositoryImpl();
		
		HelmetService helmetService = new HelmetServiceImpl(helmetRepository);
		
		boolean success=helmetService.ValidDateAndSave(dto);
		System.out.println("Success :"+ success);

	}

}
