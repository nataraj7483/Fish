package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService{
	
	public TerroristServiceImpl() {
		System.out.println("Created Terrorist Service Implementation using no-args contructor");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
    System.out.println("executing the Validating and saving is Now" );
    System.out.println("Dto initialized:"+dto);
    
    
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    Validator validator = validatorFactory.getValidator();
    Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
      if(!violations.isEmpty())
      {
    	  System.err.println("error is there ");
    	  violations.forEach(e->System.err.println(e.getMessage()));
    	  return false;
      }
    System.out.println("no validation error");
    return true;
	}

	
}
