package com.xworkz.things.equales;

public class WaterBattle {
	
	private String brand;
	private String color;
	private int quantity;
	private int price;
	private String type;
	private boolean ecofriendly;
	private boolean quality;
	private long manufacturefgdate;
	private long experpdate;
	private boolean isAWaterbottle;
	public WaterBattle(String brand, String color, int quantity, int price, String type, boolean ecofriendly,
			boolean quality, long manufacturefgdate, long experpdate, boolean isAWaterbottle) {
		super();
		this.brand = brand;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.ecofriendly = ecofriendly;
		this.quality = quality;
		this.manufacturefgdate = manufacturefgdate;
		this.experpdate = experpdate;
		this.isAWaterbottle = isAWaterbottle;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEcofriendly() {
		return ecofriendly;
	}
	public void setEcofriendly(boolean ecofriendly) {
		this.ecofriendly = ecofriendly;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public long getManufacturefgdate() {
		return manufacturefgdate;
	}
	public void setManufacturefgdate(long manufacturefgdate) {
		this.manufacturefgdate = manufacturefgdate;
	}
	public long getExperpdate() {
		return experpdate;
	}
	public void setExperpdate(long experpdate) {
		this.experpdate = experpdate;
	}
	public boolean isAWaterbottle() {
		return isAWaterbottle;
	}
	public void setAWaterbottle(boolean isAWaterbottle) {
		this.isAWaterbottle = isAWaterbottle;
	}
	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", color=" + color + ", quantity=" + quantity + ", price=" + price
				+ ", type=" + type + ", ecofriendly=" + ecofriendly + ", quality=" + quality + ", manufacturefgdate=" + manufacturefgdate
				+ ", expdate="+ experpdate + ", isAWaterbottle=" + isAWaterbottle + "]";
		
	}
	public boolean equals(Object object) {
		if(object instanceof WaterBattle) {
			WaterBattle waterBattle=(WaterBattle) object;
			
			if(this.brand.equals(waterBattle.brand)
					&&this.color.equals(waterBattle.color)
					&&this.type.equals(waterBattle.type)
					) {
				return true;
			}
		}else {
			System.out.println("brand is equal");
			System.out.println("color is equal");
			System.out.println("type is equal");
		}
		return false;	
}
}
