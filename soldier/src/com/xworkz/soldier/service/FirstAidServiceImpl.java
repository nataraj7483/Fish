package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public void FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("created service by passing repo...from spring");
		
	}
	
	
	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Running validate and save");
		System.out.println("Dto: "+ dto);
		
		
		Set<ConstraintViolation<FirstAidDTO>> violations =this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("There are validation error");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid.. + can save");
			boolean saved = this.firstAidRepo.save(dto);
			System.out.println("saved first aid "+ saved);
			return saved;
		
	}
		
	}

}
