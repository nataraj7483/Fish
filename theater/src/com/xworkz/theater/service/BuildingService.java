package com.xworkz.theater.service;

import com.xworkz.theater.dto.BuildingDTO;
import com.xworkz.theater.exception.InvalidDataException;


public interface BuildingService {
	
	boolean validDateAndSave(BuildingDTO dto) throws  InvalidDataException;

}
