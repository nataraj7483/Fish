package com.xworkz.theater.service;

import com.xworkz.theater.dto.BakeryDTO;
import com.xworkz.theater.exception.InvalidDataException;

public interface BakeryService {
	
	boolean validateAndSave(BakeryDTO dto) throws InvalidDataException;

}
