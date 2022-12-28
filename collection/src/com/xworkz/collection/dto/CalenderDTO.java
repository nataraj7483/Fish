package com.xworkz.collection.dto;

import java.io.Serializable;

public class CalenderDTO implements Serializable{
	
	private String calenderName;
	private String companyName;
	private Integer totalPages;

	public CalenderDTO() {
		super();
	}

	
	public CalenderDTO(String calenderName, String companyName, Integer totalPages) {
		super();
		this.calenderName = calenderName;
		this.companyName = companyName;
		this.totalPages = totalPages;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj!=null) {
			if(obj instanceof CalenderDTO) {
				CalenderDTO dto =(CalenderDTO)obj;
				if(dto.companyName.equals(this.companyName)) {
					System.out.println("companyName is matching "+dto.companyName);
					return true;
				}
			}
		}
		return false;
}

	@Override
	public String toString() {
		return "CalenderDTO [calenderName=" + calenderName + ", companyName=" + companyName + ", totalPages="
				+ totalPages + "]";
	}

	public String getCalenderName() {
		return calenderName;
	}

	public void setCalenderName(String calenderName) {
		this.calenderName = calenderName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	

}
