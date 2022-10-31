package com.xworkz.coding.code;

import com.xworkz.coding.Constant.Type;

public class Sweet {
	
	public static String name;
	public String shopName="Iyyanger Sweets";
	public  Type type;
	public double weight;
	public boolean costly;
	public Sweet(Type type) {
		this.type=type;
	}
	static {
		name="Jangeer";
	}
	public boolean setCostly(boolean costly) {
		this.costly=costly;
		return costly;
	}
	public void Showoff() {
		
		System.out.println(this.name);
		System.out.println(this.shopName);
		System.out.println(this.weight);
		System.out.println(this.costly);
		System.out.println(this.type);
	}
	

}
