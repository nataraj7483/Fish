package com.xworkz.collection.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable{
	
	private String purpose;
	private String month;
	private int date;

	public HolidayDTO() {
		super();
	}

	public HolidayDTO(String purpose, String month, int date) {
		super();
		this.purpose = purpose;
		this.month = month;
		this.date = date;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj!=null) {
			if(obj instanceof HolidayDTO) {
				HolidayDTO dto =(HolidayDTO)obj;
				if(dto.month.equals(this.month)) {
					System.out.println("Month is matching :" +dto.month);
					return true;
				}
			}
		}
		return false;
		}

	@Override
	public String toString() {
		return "HolidayDTO [purpose=" + purpose + ", month=" + month + ", date=" + date + "]";
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}


}
