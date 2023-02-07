package com.xworkz.nataraj.dto;

import lombok.Data;

@Data
public class BeverageDTO {
	
	private String name;
	private String row;
	private String ManufacturName;
	private String modelNo;
	private int contactno;
	private String ShopeName;
	private String state;
	public BeverageDTO(String name, String row, String manufacturName, String modelNo, int contactno, String shopeName,
			String state) {
		super();
		this.name = name;
		this.row = row;
		ManufacturName = manufacturName;
		this.modelNo = modelNo;
		this.contactno = contactno;
		ShopeName = shopeName;
		this.state = state;
	}


}
