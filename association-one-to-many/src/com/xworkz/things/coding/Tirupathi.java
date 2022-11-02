package com.xworkz.things.coding;

public class Tirupathi {
	
	private String place="Andra Tirupathi";
	int noOfPoojari;
	private String godName="Thimappa";
	int noOfsecurity;
	String poojariName;
	String assiPoojariName;
	int noOfGods;
	int totalRooms;
	String secondGodName;
	int noOfMaleGods;
	int totalFemaleGods;
	public Tirupathi(int noOfPoojari, int noOfsecurity, String poojariName, String assiPoojariName, int noOfGods,
			int totalRooms, String secondGodName, int noOfMaleGods, int totalFemaleGods) {
		super();
		this.noOfPoojari = noOfPoojari;
		this.noOfsecurity = noOfsecurity;
		this.poojariName = poojariName;
		this.assiPoojariName = assiPoojariName;
		this.noOfGods = noOfGods;
		this.totalRooms = totalRooms;
		this.secondGodName = secondGodName;
		this.noOfMaleGods = noOfMaleGods;
		this.totalFemaleGods = totalFemaleGods;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getGodName() {
		return godName;
	}
	public void setGodName(String godName) {
		this.godName = godName;
	}
	public void showOff() {
		
		System.out.println(this.noOfPoojari);
		System.out.println(this.noOfsecurity);
		System.out.println(this.poojariName);
		System.out.println(this.assiPoojariName);
		System.out.println(this.noOfGods);
		System.out.println(this.totalRooms);
		System.out.println(this.secondGodName);
		System.out.println(this.noOfMaleGods);
		System.out.println(this.totalFemaleGods);
	}
	

}
