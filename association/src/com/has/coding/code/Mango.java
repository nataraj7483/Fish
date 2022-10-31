package com.has.coding.code;

import com.has.coding.constant.MangoColor;

public class Mango {
	public String name;
	public double weight;
	public int price;
	public MangoColor color;
	public boolean quality;
	
	public Mango(String name, double weight, int price,boolean quality,MangoColor color) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.color = color;
		this.quality = quality;
	}
	public void display()
	{
		
		System.out.println(this.name);
		System.out.println(this.weight);
		System.out.println(this.price);

		System.out.println(this.color);

		System.out.println(this.quality);
		System.out.println(color.quantity);
		System.out.println(color.ordinal());
		System.out.println(MangoColor.GREEN.ordinal());
		System.out.println(MangoColor.YELLOW);
		

	}

    
	
	

}
