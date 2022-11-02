package com.xworkz.things.coding;

public class Tv {
	
	private String brand = "BPL";
	double price;
	String tvName;
	double leangth;
	double width;
	String ambassador;
	String manufacturedIn;
	int manufacturedyear;
	int deliveryCharges;
	String screenColour;
	boolean hang;
	boolean android;
	String access;
	
	
	public Tv(double price, String tvName, double leangth, double width, String ambassador, String manufacturedIn,
			int manufacturedyear, int deliveryCharges, String screenColour, boolean hang, boolean android,
			String access) {
		this.price = price;
		this.tvName = tvName;
		this.leangth = leangth;
		this.width = width;
		this.ambassador = ambassador;
		this.manufacturedIn = manufacturedIn;
		this.manufacturedyear = manufacturedyear;
		this.deliveryCharges = deliveryCharges;
		this.screenColour = screenColour;
		this.hang = hang;
		this.android = android;
		this.access = access;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	 void setBrand(String brand)
	{
		this.brand=brand;
	}
	 public void showOff()
	 {
		 System.out.println("Access :"+this.access);
		 System.out.println("Ambassador :"+this.ambassador);
		 System.out.println("Android :"+this.android);
		 System.out.println("Delivery Charge :"+this.deliveryCharges);
		 System.out.println("Hang :"+this.hang);
		 System.out.println("Length :"+this.leangth);
		 System.out.println("Manufacture in :"+this.manufacturedIn);
		 System.out.println("Manufactured year :"+this.manufacturedyear);
		 System.out.println("Price :"+this.price);
		 System.out.println("Screen colour :"+this.screenColour);
		 System.out.println("Tv Name :"+this.tvName);
		 System.out.println("Width :"+this.width);
		 
	 }

}
