package com.xworkz.exception.type;

public abstract class Person extends Object {
	
	private String name;
	private int age;
	private String location;
	private long mobileNo;
	private String state;
	
	public Person(String name, int age, String location, long mobileNo, String state) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.mobileNo = mobileNo;
		this.state = state;
	}
	
	public void eat() {
		System.out.println("eating");
		
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
		System.out.println(mobileNo);
		System.out.println(state);
	}
	
	

}
