package com.xworkz.theater.service;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.exception.InvalidDataException;


public interface TheaterService {
	
	boolean validDateAndSave(TheaterDTO dto) throws InvalidDataException;

}
