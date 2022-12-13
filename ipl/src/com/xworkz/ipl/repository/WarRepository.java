package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {
	
	boolean Create(WarDTO warDTO);
	
	default int total() {
		return 0;
	}
	default WarDTO tempWar(String tempWarName) {
		return null;
	}

}
