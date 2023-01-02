package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {

		Collection<ApplicationDTO> applicationDTO = new LinkedList<ApplicationDTO>();
		applicationDTO.add(new ApplicationDTO("Mobile Applications", 3.2, false, "Raj", 10000));
		applicationDTO.add(new ApplicationDTO("Cloud Applications", 4.2, false, "Raj", 11000));
		applicationDTO.add(new ApplicationDTO("Web Applications", 2.0, false, "Raj", 12000));
		applicationDTO.add(new ApplicationDTO("Mobile Applications", 3.3, false, "Raj", 13000));
	
		applicationDTO
		.stream()
		.filter(dto -> dto.isFree() && "google".contains(dto.getDevelopedBy()))
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto));
		
		applicationDTO
		.stream()
		.filter(dto -> dto.getVersion() > 5)
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto.getName()));
	}

}
