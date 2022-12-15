package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetDTO extends AbstractAuditDTO{
	
    private String brand;
    private Double price;
    private HelmetType type;
    private Color color;
    
	public HelmetDTO() {
		super();
	}

	public HelmetDTO(String brand, Double price, HelmetType type, Color color) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.color = color;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", price=" + price + ", type=" + type + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
    
 }
