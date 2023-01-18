package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepo;
import com.xworkz.soldier.repository.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("Manu SP Gowda", 420, "Middle", "Captan", "Uganda");
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
		
	}

}
