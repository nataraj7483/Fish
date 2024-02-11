package com.xworkz.fire.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.fire.entity.FireStationEntity;

public interface FireStationRepository {
	
	boolean save(FireStationEntity entity);
	
	boolean update(FireStationEntity entity);
	
	default FireStationEntity findById(int id) {
		return null;
	}
	default FireStationEntity deleteById(int id) {
		return null;
	}
	
	default List<FireStationEntity> findByStationName(String stationName){
		return Collections.emptyList();
	}

}
