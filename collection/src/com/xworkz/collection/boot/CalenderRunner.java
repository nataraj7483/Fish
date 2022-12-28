package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalenderDTO;

public class CalenderRunner {

	public static void main(String[] args) {

		CalenderDTO dto1 = new CalenderDTO ("SaiBabaCalender", "Arun Art",12);
		CalenderDTO dto2 = new CalenderDTO ("GaneshCalender", "Brahma Books",6);
		CalenderDTO dto3 = new CalenderDTO ("RajCalender","Crudearea",13);
		CalenderDTO dto4 = new CalenderDTO ("LakshmiCalender","Chumbak",14);
		CalenderDTO dto5 = new CalenderDTO ("JoshiCalender","Doodle",8);
		
		boolean equals =  dto1.equals( dto4);
		System.out.println(equals);
		
		Collection< CalenderDTO>  calendars = new ArrayList< CalenderDTO>();
		calendars.add(dto1);
		calendars.add(dto2);
		
		boolean contains = calendars.contains( dto4);
		System.out.println("contains :" +contains);

		
	}

}
