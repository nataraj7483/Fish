package com.xworkz.collection.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable{
	
	private String name;
	private String location;
	private String BuiltBy;
	private boolean destroyed;
	private double visitingFees;
	public PalaceDTO() {
		super();
	}
	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		BuiltBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}
	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", BuiltBy=" + BuiltBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBuiltBy() {
		return BuiltBy;
	}
	public void setBuiltBy(String builtBy) {
		BuiltBy = builtBy;
	}
	public boolean isDestroyed() {
		return destroyed;
	}
	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}
	public double getVisitingFees() {
		return visitingFees;
	}
	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}
	
	

}
