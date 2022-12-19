package com.xworkz.theater.dto;

public class RailwayStationDTO extends AbstractAuditDTO{
	
	private String name;
	private int noOfPlatforms;
	private String area;
	private int platformTicket;
	public RailwayStationDTO() {
		super();
	}
	public RailwayStationDTO(String name, int noOfPlatforms, String area, int platformTicket) {
		super();
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicket = platformTicket;
	}
	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicket=" + platformTicket + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}
	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPlatformTicket() {
		return platformTicket;
	}
	public void setPlatformTicket(int platformTicket) {
		this.platformTicket = platformTicket;
	}
	
	

}
