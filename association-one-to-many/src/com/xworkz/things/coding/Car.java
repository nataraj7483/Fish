package com.xworkz.things.coding;

public class Car {
	
	private String carName="Jaguar";
	int noOfCompanny;
	private String companyName="TATA Motors";
	int noOfsecurity;
	String ownerName;
	String ownerDaughterName;
	int noOfGates;
	int totalCars;
	long ownerNo;
	int noOfEmployes;
	int totalFemaleEmployes;
	public Car(int noOfCompanny, int noOfsecurity, String ownerName, String ownerDaughterName, int noOfGates,
			int totalCars, long ownerNo, int noOfEmployes, int totalFemaleEmployes) {
		super();
		this.noOfCompanny = noOfCompanny;
		this.noOfsecurity = noOfsecurity;
		this.ownerName = ownerName;
		this.ownerDaughterName = ownerDaughterName;
		this.noOfGates = noOfGates;
		this.totalCars = totalCars;
		this.ownerNo = ownerNo;
		this.noOfEmployes = noOfEmployes;
		this.totalFemaleEmployes = totalFemaleEmployes;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void showOff() {
		System.out.println(this.noOfCompanny);
		System.out.println(this.noOfsecurity);
		System.out.println(this.ownerName);
		System.out.println(this.ownerDaughterName);
		System.out.println(this.noOfGates);
		System.out.println(this.totalCars);
		System.out.println(this.ownerNo);
		System.out.println(this.noOfEmployes);
		System.out.println(this.totalFemaleEmployes);
	}

}
