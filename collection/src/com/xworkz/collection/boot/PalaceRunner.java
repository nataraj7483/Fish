package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> palaceDTO = new ArrayList<PalaceDTO>();
		palaceDTO.add(new PalaceDTO("Mysoru Palace", "Mysore", "Vani Villasa", false, 150));
		palaceDTO.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Akshay", true, 50));
		palaceDTO.add(new PalaceDTO("Tippu Palace", "Bangalore", "Raj", false, 840));
		palaceDTO.add(new PalaceDTO("NS Palace", "Bangalore", "Sanjay", true, 10));

		palaceDTO.stream().filter(dto->!dto.isDestroyed())
		.collect(Collectors.toSet())
		.forEach(dto->System.out.println(dto));
		
	}

}
