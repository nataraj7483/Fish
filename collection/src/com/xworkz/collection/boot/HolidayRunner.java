package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {

		HolidayDTO dto1= new HolidayDTO("BirthDay", "April", 1999);
		HolidayDTO dto2= new HolidayDTO("DeathDay", "April", 2080);
		HolidayDTO dto3= new HolidayDTO("GoodFriday", "April", 2023);
		HolidayDTO dto4= new HolidayDTO("HanumanJayanthi", "june", 2024);
		HolidayDTO dto5= new HolidayDTO("Fever", "December", 2022);
		
		boolean equals =  dto1.equals( dto2);
		System.out.println(equals);
		
		Collection< HolidayDTO>  ref = new ArrayList< HolidayDTO>();
		ref.add( dto1);
		ref.add( dto2);
		
		boolean contains = ref.contains( dto3);
		System.out.println("contains :" +contains);
	}

}
