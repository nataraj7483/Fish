package com.xworkz.things.equales;

public class Vehicles {
	
	private String company;
	private String name;
	private long price;
	private String color;
	private int noOfWheels;
	private boolean sensor;
	private int gearLines;
	private String brand;
	private int doors;
	private int windows;
	public Vehicles(String company, String name, long price, String color, int noOfWheels, boolean sensor,
			int gearLines, String brand, int doors, int windows) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.sensor = sensor;
		this.gearLines = gearLines;
		this.brand = brand;
		this.doors = doors;
		this.windows = windows;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public boolean isSensor() {
		return sensor;
	}
	public void setSensor(boolean sensor) {
		this.sensor = sensor;
	}
	public int getGearLines() {
		return gearLines;
	}
	public void setGearLines(int gearLines) {
		this.gearLines = gearLines;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	@Override
	public String toString() {
		return "Vehicle[company="+company+",name="+name+",price="+price+",color="+color+",noOfWheels="+noOfWheels+",sensor="+sensor+",gearLines="+gearLines+",brand="+brand+",doors="+doors+",windows="+windows+"]";
		
		
	}
	public boolean equals(Object object) {
		if(object instanceof Vehicles) {
			Vehicles vehicles=(Vehicles) object;
			
			if(this.brand.equals(vehicles.brand)&&this.color.equals(vehicles.color)) {
				return true;
			}
		}else {
			System.out.println("brand is equal");
			System.out.println("color is equal");
		}
		return false;	
			
	}

	

}
