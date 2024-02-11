package com.xworkz.fire.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.fire.dto.FireStationDTO;
import com.xworkz.fire.entity.FireStationEntity;
import com.xworkz.fire.repository.FireStationRepository;

@Service
public class FireStationServiceImpl implements FireStationService {
	
	@Autowired
	
	private FireStationRepository fireStationRepository;
	
	public FireStationServiceImpl() {
		System.out.println("Created"+ getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<FireStationDTO>> validateAndSave(FireStationDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FireStationDTO>> violations = validator.validate(dto);
		if(violations!= null && !violations.isEmpty()) {
			System.err.println("Violation in dto "+ dto);
			return violations;
		}else {
			System.out.println("violations is not there in dto can save");
			FireStationEntity entity = new FireStationEntity();
			entity.setStationName(dto.getStationName());
			entity.setLocation(dto.getLocation());
			entity.setFireStationNo(dto.getFireStationNo());
			entity.setNoOfVehicles(dto.getNoOfVehicles());
			boolean save = fireStationRepository.save(entity);
			System.out.println("Entity data is saved" + save);
			return Collections.emptySet();
		}
		
	}
	@Override
	public FireStationDTO findById(int id) {
		if(id>0) {
			FireStationEntity entity = fireStationRepository.findById(id);
			if(entity !=null) {
				System.out.println("Entity is found in service for id "+ id);
				FireStationDTO dto = new FireStationDTO();
				dto.setStationName(entity.getStationName());
				dto.setLocation(entity.getLocation());
				dto.setFireStationNo(entity.getFireStationNo());
				dto.setNoOfVehicles(entity.getNoOfVehicles());
				dto.setId(entity.getId());
				return dto;
				
			}
		}
		return FireStationService.super.findById(id);
	}
	@Override
	public List<FireStationDTO> findByStationName(String stationName){
		System.out.println("Running findByStationName in service" + stationName);
		if(stationName != null && !stationName.isEmpty()) {
			System.out.println("StationName is valid calling repo");
			List<FireStationEntity> entities = fireStationRepository.findByStationName(stationName);
			List<FireStationDTO> listDTO = new ArrayList<FireStationDTO>();
			for(FireStationEntity entity : entities) {
				FireStationDTO dto = new FireStationDTO();
				dto.setStationName(entity.getStationName());
				dto.setLocation(entity.getLocation());
				dto.setFireStationNo(entity.getFireStationNo());
				dto.setNoOfVehicles(entity.getNoOfVehicles());
				dto.setId(entity.getId());
				listDTO.add(dto);
			}
			System.out.println("Size in dto "+ listDTO.size());
			System.out.println("Size in entities "+ entities.size());
			return listDTO;
		}else {
			System.err.println("Name is valid");
		}
		return FireStationService.super.findByStationName(stationName);
	}
	@Override
	public Set<ConstraintViolation<FireStationDTO>> validateAndUpdate(FireStationDTO dto){
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<FireStationDTO>> violations =validator.validate(dto);
		if(violations!= null && !violations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return violations;
		}else {
			System.out.println("Violations is not there in dto, can save");
			FireStationEntity entity = new FireStationEntity();
			entity.setStationName(dto.getStationName());
			entity.setLocation(dto.getLocation());
			entity.setFireStationNo(dto.getFireStationNo());
			entity.setNoOfVehicles(dto.getNoOfVehicles());
			entity.setId(dto.getId());
			boolean saved = fireStationRepository.update(entity);
			System.out.println("entity data is saved" +saved);
			return Collections.emptySet();
			
		}
		
	}
	
	@Override
	public FireStationDTO deleteById(int id) {
		if(id>0) {
			FireStationEntity entity = fireStationRepository.deleteById(id);
			FireStationDTO dto = new FireStationDTO();
			dto.setStationName(entity.getStationName());
			dto.setLocation(entity.getLocation());
			dto.setFireStationNo(entity.getFireStationNo());
			dto.setNoOfVehicles(entity.getNoOfVehicles());
			dto.setId(entity.getId());
			return dto;
		}
		return FireStationService.super.deleteById(id);
	}
	
	

}
