package com.xworkz.theater.service;

import com.xworkz.theater.dto.PlaceDTO;
import com.xworkz.theater.exception.InvalidDataException;

public interface PlaceService {
	
	boolean validDateAndSave(PlaceDTO dto) throws InvalidDataException;

}
