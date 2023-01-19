package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {
	
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {

		System.out.println("running validate and save");
		System.out.println("dto "+ dto);
		
		Set<ConstraintViolation<ResortDTO>> violations =this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("There are validation error");
			violations.forEach(cv-> System.out.println(cv.getMessage()));
			return false;
			
		}else {
			System.out.println("data is valid");
			boolean saved = this.resortRepo.save(dto);
			System.out.println("saved "+ saved);
			return saved;
		}
		
		
	}

}
