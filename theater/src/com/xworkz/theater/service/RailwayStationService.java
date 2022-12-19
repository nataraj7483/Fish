package com.xworkz.theater.service;

import com.xworkz.theater.dto.RailwayStationDTO;
import com.xworkz.theater.exception.InvalidDataException;

public interface RailwayStationService {
	
	boolean validDateAndSave(RailwayStationDTO dto) throws InvalidDataException;

}
