package com.xworkz.fire.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FireStationDTO {
	
	private int id;
	@NotBlank(message = "StationName cannot be null")
	@Size(min = 3, max = 30, message= "StationName should be more than 3 or less than 30")
	private String stationName;
	@NotBlank(message = "Location cannot be null")
	@Size(min = 3, max = 30, message= "Location should be more than 3 or less than 30")
	private String location;
	@NotNull(message = "FireStation No cannot be null")
	@Min(value=1, message= "FireStation No cannot be less than 0")
	private Integer fireStationNo;
	@NotNull(message = "NoOfVehicles No cannot be null")
	@Min(value=1, message= "NoOfVehicles No cannot be less than 0")
	private Integer noOfVehicles;

}
