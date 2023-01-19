package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("running save in repo..");
		System.out.println("dto "+ dto);
		return false;
	}

}
