package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO{
	
	@NonNull
	@NotBlank
	@Size(min=4, max=20)
	private String name;
	@Min(0)
	@Max(450)
	private int id;
	@NonNull
	@NotBlank
	@Size(min=3, max=19)
	private String rank;
	@NonNull
	@NotBlank
	@Size(min=5, max=30)
	private String batallion;
	@NonNull
	@NotBlank
	@Size(min=3, max=50)
	private String country;

}
