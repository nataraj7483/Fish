package com.xworkz.ipl.dto;

public class WarDTO extends AbstractAuditDTO{
	
	private String name;
	private int startDate;
	private int endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeaths;
    
	
	
	


	public WarDTO() {
		
		System.out.println("calling no arguments constant of WarDTO");
	}


	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths + ", toString()="
				+ super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStartDate() {
		return startDate;
	}


	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}


	public int getEndDate() {
		return endDate;
	}


	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}


	public String getStartedBy() {
		return startedBy;
	}


	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}


	public String getStartedWith() {
		return startedWith;
	}


	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}


	public String getWonBy() {
		return wonBy;
	}


	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}


	public int getNoOfDeaths() {
		return noOfDeaths;
	}


	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

}
