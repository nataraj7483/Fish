package com.xworkz.terrorist.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TerroristDTO extends AbstractAuditDTO{
	
	
	@NonNull
	@NotNull(message = "Terrorist name is not  pointing to the null")
	@Size(min = 5 ,max = 18,message = "Name is invalid it should contain min 5 and max 18 letters")
	private String name;
	@NonNull
	@Min (value = 3,message = "Age should be greater than 3 or less than 50")
	@Max(value = 50,message = "Age should be greater than 3 or less than 50")
	private int age;
	@NotNull(message = "Country should not null fill country name there")
	@Size (min = 2 , max = 19,message = "Country name is invalid it should be contain more then 2 and less than 19 letters")
	private String country;
	private boolean alive;
	@NotNull(message = "specialization should not be null fill specialization name there")
	@Size (min =5, max = 10,message = "specialization is invalid it should be contain more then 5 and less than 10 letters")
	private String specialization;
	@NotNull(message = "Organization should not be null fill organization name there")
	@Size (min = 4 , max = 10,message = "Organization name is invalid it should be contain more then 4 and less than 10 letters")
	private String organization;
	private boolean prison;
	
	@Override
	public String toString() {
		return "TerroristDTO [name=" + name + ", age=" + age + ", country=" + country + ", alive=" + alive
				+ ", specialization=" + specialization + ", organization=" + organization + ", prison=" + prison + "]";
	}

	

	

}
