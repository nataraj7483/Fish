package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("running save in repo..");
		System.out.println("dto" + dto);
		return false;
	}

}
