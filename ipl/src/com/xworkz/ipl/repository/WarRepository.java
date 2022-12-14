package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {
	
	boolean Create(WarDTO warDTO);
	
	default int total() {
		return 0;
	}
	default WarDTO findStartedBy(String tempWarName) {
		return null;
	}
	default WarDTO findByStartedAndStartedWith(String startedWith,String startedBy,LocalDateTime started,LocalDateTime ended) {
		return null;
	}

}
