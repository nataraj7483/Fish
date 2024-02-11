package com.xworkz.fire.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.fire.dto.FireStationDTO;

public interface FireStationService {
	
	
	Set<ConstraintViolation<FireStationDTO>> validateAndSave(FireStationDTO dto);
	
	default FireStationDTO findById(int id) {
		return null;
	}
	
	default FireStationDTO deleteById(int id) {
		return null;
	}
	
	default List<FireStationDTO> findByStationName(String stationName){
		return Collections.emptyList();
	}
	
	Set<ConstraintViolation<FireStationDTO>> validateAndUpdate(FireStationDTO dto);

}
