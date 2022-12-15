package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDTO{
	
	private String name;
	private String company;
	private PizzaSize size;
	private boolean chees;
	private double price;
	private String flavour;
	private String type;
	
	public PizzaDTO() {
	
	}

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", size=" + size + ", chees=" + chees + ", price="
				+ price + ", flavour=" + flavour + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isChees() {
		return chees;
	}

	public void setChees(boolean chees) {
		this.chees = chees;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
