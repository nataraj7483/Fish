package com.xworkz.bakery.dto;

import lombok.Data;

@Data
public class BakeryDTO {
	
	private String name;
	private String owner;
	private String wife;
	private boolean married;
	private String famous;
	private int since;
	public BakeryDTO(String name, String owner, String wife, boolean married, String famous, int since) {
		super();
		this.name = name;
		this.owner = owner;
		this.wife = wife;
		this.married = married;
		this.famous = famous;
		this.since = since;
	}

}
