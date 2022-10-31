package com.has.coding.code;

import com.has.coding.constant.PillarShape;

public class Pillar {
	
	public int id;
	public String place;
	public PillarShape pillarShape=PillarShape.ROUND;
	public Company company=new Company("Raj","Constuction Company");
	
	public Pillar(int id,String place) {
		super();
		this.id=id;
		this.place=place;
	}
	public void constructing(String name) {
		System.out.println("running constructing");
		System.out.println(name);
		
		if(company!=null) {
			this.company.startCompany();
		}
		else {
			System.out.println("company is null");
		}
	}
	public void display() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.pillarShape);
		this.company.showOff();
	}

}
