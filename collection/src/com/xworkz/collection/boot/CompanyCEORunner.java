package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.CompanyCEODTO;
import com.xworkz.collection.dto.DaugheterDTO;

public class CompanyCEORunner{

	public static void main(String[] args) {

		Collection<CompanyCEODTO> companyCEODTO = new LinkedList<CompanyCEODTO>();

		DaugheterDTO dto1 = new DaugheterDTO("Ramya", 987654320L, 15, true, false);
		DaugheterDTO dto2 = new DaugheterDTO("Rakshita", 9876543211L, 23, false, false);
		DaugheterDTO dto3 = new DaugheterDTO("Radhika", 987654312L, 35, true, true);

		
		companyCEODTO.add(new CompanyCEODTO("Raj", "MI", 23, "India","BE", false, dto1));
		companyCEODTO.add(new CompanyCEODTO("NTRJ", "VI", 25, "India","LLB", true, dto2));
		companyCEODTO.add(new CompanyCEODTO("Nataraj", "HMT", 45, "India","PUC", false, dto3));

		
		companyCEODTO.stream()
		.filter(dto->dto.getDaugheterDTO()!=null)
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println("print all the daughter names in Company ceo dto");
		
		companyCEODTO
		.stream().map(dto->dto.getDaugheterDTO().getDaughterName())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println("CEO age greater than 30");
		
		companyCEODTO
		.stream()
		.filter(dto->dto.getAge()>=30).
		collect(Collectors.toList()).
		forEach(dto->System.out.println(dto.getAge()));
		System.out.println("get the daughter age and company ceo age");
		
		companyCEODTO
		.stream().map((dto)->dto.getAge())
		.forEach((dto)->{System.out.println("father age  "+dto);});
	
		
	}

}
