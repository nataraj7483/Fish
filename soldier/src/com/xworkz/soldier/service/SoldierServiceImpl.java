package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {

	
	private SoldierRepo soldierRepo;
	
	 public SoldierServiceImpl() {
		 System.out.println("Created soldier using no-argumant constructor");
	}
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo= soldierRepo;
	}


	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		
		System.out.println("Starting validateAndSave");
		System.out.println("dto passed: "+ dto);
		
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(v -> {System.out.println("Violating message:"+ v.getMessage());
			});
			return false;

		}else {
			System.out.println("data is valid");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repo" + saved);
			return saved;
		}
		
		
	}
	

}
