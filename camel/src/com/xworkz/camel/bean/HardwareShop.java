package com.xworkz.camel.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private String gstNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;
	
	
	public HardwareShop() {
	System.out.println("Creating a constructor");
	}


	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	

}
