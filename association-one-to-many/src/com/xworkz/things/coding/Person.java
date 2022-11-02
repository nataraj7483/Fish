package com.xworkz.things.coding;

public class Person {
	
	public String name;
	public Email[] email;
	public Job job=new Job(26000,"Assistant Engg",5);
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public void setEmail(Email[] email) {
		this.email=email;
	}
	
	public void showOff() {
		System.out.println(this.name);
		for (int i = 0; i < email.length; i++) {
			Email names=this.email[i];
			//System.out.println(names);
			if(names!=null) {
				names.showOff();
				
			}
			else {
				System.out.println("email is null or empty");
			}
		}
	
		
		
			
		
	}
	
	

}
