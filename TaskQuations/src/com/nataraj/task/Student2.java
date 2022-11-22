package com.nataraj.task;

public class Student2 {    //Constructor Overloading
	
	int id;
	String name;
	int age;
	
	//creating two constructor
	Student2(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//creating three arg constructor
	Student2(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[]arg) {
		 Student2 student2=new Student2(11,"Raj",23);
		 student2.display();
	}

}
