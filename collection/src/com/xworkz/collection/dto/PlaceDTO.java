package com.xworkz.collection.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable{
	
	private String placeName;
	private String famousFor;
	private String devotion;
	
	public PlaceDTO() {
		super();
	}

	public PlaceDTO(String placeName, String famousFor, String devotion) {
		super();
		this.placeName = placeName;
		this.famousFor = famousFor;
		this.devotion = devotion;
	}
	public boolean equqls(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)obj;
				if(dto.placeName.equals(this.placeName)) {
					System.out.println("placeName is matching:" +dto.placeName);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PlaceDTO [placeName=" + placeName + ", famousFor=" + famousFor + ", devotion=" + devotion + "]";
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getDevotion() {
		return devotion;
	}

	public void setDevotion(String devotion) {
		this.devotion = devotion;
	}
	
	

}
