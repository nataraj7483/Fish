package com.xworkz.things.equales;

public class Paints {
	
	private String company;
	private String name;
	private String brand;
	private String color;
	private String type;
	private double price;
	private double weight;
	private boolean quality;
	private long manufactureDate;
	private long expDate;
	public Paints(String company, String name, String brand, String color, String type, double price, double weight,
			boolean quality, long manufactureDate, long expDate) {
		super();
		this.company = company;
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.quality = quality;
		this.manufactureDate = manufactureDate;
		this.expDate = expDate;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public long getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(long manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public long getExpDate() {
		return expDate;
	}
	public void setExpDate(long expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public String toString() {
		return "Paint[company="+brand+",name="+name+",brand="+brand+",color="+color+", type="+type+",price="+price+",weight="+weight+",quality="+quality+",manufactureDate="+manufactureDate+",expDate="+expDate+"]";
		
	}
	public boolean equals(Object object) {
		if(object instanceof Paints) {
			Paints paints=(Paints) object;
			
			if(this.brand.equals(paints.brand)&&this.color.equals(color)) {
				return true;
			}
		}else {
			System.out.println("brand is equal");
		}
		return false;	
			
	}
	
	

}
