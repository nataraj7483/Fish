package com.xworkz.nataraj.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class EducationDTO {
	
	private String name;
	private String location;
	private String area;
	private String type;
	private int year;
	private String distic;
	private String pincode;
	private String passedout;
	private String courseName;
	private String collegeName;
	public EducationDTO(String name, String location, String area, String type, int year, String distic, String pincode,
			String passedout, String courseName, String collegeName) {
		super();
		this.name = name;
		this.location = location;
		this.area = area;
		this.type = type;
		this.year = year;
		this.distic = distic;
		this.pincode = pincode;
		this.passedout = passedout;
		this.courseName = courseName;
		this.collegeName = collegeName;
	}

	

}
