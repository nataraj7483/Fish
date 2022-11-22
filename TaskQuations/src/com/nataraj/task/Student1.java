package com.nataraj.task;

public class Student1 {   //parameterized constructor
	
	int id;
	String name;
	
	//creating parameterized constructor
	
	Student1(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	//creating to display the values
	public void display() {
		
		//creating object and passing values
		System.out.println(this.id);
		System.out.println(this.name);
	}
	
	public static void main(String[]arg) {
		 Student1 student1 =new Student1(123,"Raj");
		 
		 //calling method to display the values of object
		 student1.display();
	}

}
