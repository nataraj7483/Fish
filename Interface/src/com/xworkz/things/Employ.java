package com.xworkz.things;

public class Employ implements Person{
	
	public String name() {
		System.out.println("name of Person");
		return "name";
	}
	public double salary() {
		System.out.println("salary of person");
		return 0;
	}
	public int age() {
		System.out.println("age of person");
		return 0;
	}
	public String gender() {
		System.out.println("gender of an person");
		return "gender";
	}
	public float height() {
		System.out.println("height of an person");
		return 0;
	}
	
	public static void main(String[] agr) {
		
		Person person = new Employ();
		person.name();
		person.salary();
		person.age();
		person.gender();
		person.height();
		
		
	}

}
