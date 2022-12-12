package com.xworkz.things.equales;

public class God {

	private String name;
	private String color;
	private int noOfHands;
	private boolean isGod;
	private String location;
	private String state;
	private String poojariName;
	private long number;
	private long salary;
	private int noOfGod;

	public God(String name, String color, int noOfHands, boolean isGod, String location, String state,
			String poojariName, long number, long salary, int noOfGod) {
		super();
		this.name = name;
		this.color = color;
		this.noOfHands = noOfHands;
		this.isGod = isGod;
		this.location = location;
		this.state = state;
		this.poojariName = poojariName;
		this.number = number;
		this.salary = salary;
		this.noOfGod = noOfGod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfHands() {
		return noOfHands;
	}

	public void setNoOfHands(int noOfHands) {
		this.noOfHands = noOfHands;
	}

	public boolean isGod() {
		return isGod;
	}

	public void setGod(boolean isGod) {
		this.isGod = isGod;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPoojariName() {
		return poojariName;
	}

	public void setPoojariName(String poojariName) {
		this.poojariName = poojariName;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getNoOfGod() {
		return noOfGod;
	}

	public void setNoOfGod(int noOfGod) {
		this.noOfGod = noOfGod;
	}

	@Override
	public String toString() {
		return "God[name=" + name + ",color=" + color + ",noOfHands=" + noOfHands + ",isGod=" + isGod + ",location="
				+ location + ",state=" + state + ",poojariName=" + poojariName + ",number=" + number + ",salary="
				+ salary + ",noOfGods=" + noOfGod + "]";
	}

	public boolean equals(Object object) {
		if (object instanceof God) {
			God god = (God) object;

			if (this.name.equals(god.name) && this.color.equals(god.color) && this.state.equals(god.state)
					&& this.location.equals(god.location)) {
				return true;

			}

		} else {
			System.out.println("name is not equal");
			System.out.println("color is not  equal");
			System.out.println("state is equal");
			System.out.println("location is equal");
		}
		return false;
	}
}