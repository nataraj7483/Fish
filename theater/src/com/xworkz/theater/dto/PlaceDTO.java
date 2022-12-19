package com.xworkz.theater.dto;

public class PlaceDTO extends AbstractAuditDTO{
	
	private String name;
	private String famousFor;
	private String FamousTemple;
	private double distance;
	private String famousHotel;
	public PlaceDTO() {
		super();
	}
	public PlaceDTO(String name, String famousFor, String famousTemple, double distance, String famousHotel) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		FamousTemple = famousTemple;
		this.distance = distance;
		this.famousHotel = famousHotel;
	}
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", FamousTemple=" + FamousTemple + ", distance="
				+ distance + ", famousHotel=" + famousHotel + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public String getFamousTemple() {
		return FamousTemple;
	}
	public void setFamousTemple(String famousTemple) {
		FamousTemple = famousTemple;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getFamousHotel() {
		return famousHotel;
	}
	public void setFamousHotel(String famousHotel) {
		this.famousHotel = famousHotel;
	}
	
	

}
