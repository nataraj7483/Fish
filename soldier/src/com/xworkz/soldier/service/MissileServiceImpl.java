package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {
	
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;
	
	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running validate and save");
		System.out.println("dto "+ dto);
	
		Set<ConstraintViolation<MissileDTO>> violations =this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(cv-> System.out.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("data is valid");
			boolean saved =this.missileRepo.save(dto);
			System.out.println("saved "+ saved);
			return saved;
		}
		
		
	}

}
