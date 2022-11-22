package com.nataraj.task;

public class Student {    //Default constructor
	
	int id;
	String name;
	
	//method to display the value of id and name
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] arg) {
		
		//creating object
		Student student=new Student();
		student.display();
	}

}
