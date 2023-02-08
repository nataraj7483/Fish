package com.xworkz.nataraj.dto;

import lombok.Data;

@Data
public class MobileDTO {
	
	private String mobile;
	private String company;
	private int releseYear;
	private String nation;
	private String manufaturDate;
	public MobileDTO(String mobile, String company, int releseYear, String nation, String manufaturDate) {
		super();
		this.mobile = mobile;
		this.company = company;
		this.releseYear = releseYear;
		this.nation = nation;
		this.manufaturDate = manufaturDate;
	}


}
