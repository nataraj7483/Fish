package com.xworkz.nataraj.dto;

import lombok.Data;

@Data
public class MobileDTO {
	
	private String name;
	private String company;
	private int releseYear;
	private String nation;
	private String manufaturDate;
	public MobileDTO(String name, String company, int releseYear, String nation, String manufaturDate) {
		super();
		this.name = name;
		this.company = company;
		this.releseYear = releseYear;
		this.nation = nation;
		this.manufaturDate = manufaturDate;
	}


}
