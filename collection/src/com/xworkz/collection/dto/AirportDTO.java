package com.xworkz.collection.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable{
	
	private String airportName;
	private Integer flightTicketPrice;
	private String flightName;
	
	public AirportDTO() {
		super();
	}

	public AirportDTO(String airportName, Integer flightTicketPrice, String flightName) {
		super();
		this.airportName = airportName;
		this.flightTicketPrice = flightTicketPrice;
		this.flightName = flightName;
	}
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO)obj;
				if(dto.airportName.equals(this.airportName)) {
					System.out.println("AirportName is matching:"+dto.airportName);
					return true;
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Airport [airportName=" + airportName + ", flightTicketPrice=" + flightTicketPrice + ", flightName="
				+ flightName + "]";
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public Integer getFlightTicketPrice() {
		return flightTicketPrice;
	}

	public void setFlightTicketPrice(Integer flightTicketPrice) {
		this.flightTicketPrice = flightTicketPrice;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

}
