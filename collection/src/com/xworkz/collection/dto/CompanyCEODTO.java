package com.xworkz.collection.dto;

import java.io.Serializable;

public class CompanyCEODTO implements Serializable{
	
	private String name;
	private String companyName;
	private int age;
	private String country;
	private String quqlification;
	private boolean married;
	private DaugheterDTO daugheterDTO;
	public CompanyCEODTO() {
		super();
	}
	public CompanyCEODTO(String name, String companyName, int age, String country, String quqlification,
			boolean married, DaugheterDTO daugheterDTO) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.age = age;
		this.country = country;
		this.quqlification = quqlification;
		this.married = married;
		this.daugheterDTO = daugheterDTO;
	}
	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", companyName=" + companyName + ", age=" + age + ", country=" + country
				+ ", quqlification=" + quqlification + ", married=" + married + ", daugheterDTO=" + daugheterDTO + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getQuqlification() {
		return quqlification;
	}
	public void setQuqlification(String quqlification) {
		this.quqlification = quqlification;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public DaugheterDTO getDaugheterDTO() {
		return daugheterDTO;
	}
	public void setDaugheterDTO(DaugheterDTO daugheterDTO) {
		this.daugheterDTO = daugheterDTO;
	}
	
	


}
