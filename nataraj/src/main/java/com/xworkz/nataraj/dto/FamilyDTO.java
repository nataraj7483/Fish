package com.xworkz.nataraj.dto;

import lombok.Data;

@Data
public class FamilyDTO {
	
	private String name;
	private String fatherName;
	private String motherName;
	private String sisterName;
	private String nativeName;
	private String distic;
	private String place;
	private String surname;
	private String grandFatherName;
	public FamilyDTO(String name, String fatherName, String motherName, String sisterName, String nativeName,
			String distic, String place, String surname, String grandFatherName) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.sisterName = sisterName;
		this.nativeName = nativeName;
		this.distic = distic;
		this.place = place;
		this.surname = surname;
		this.grandFatherName = grandFatherName;
	}

}
