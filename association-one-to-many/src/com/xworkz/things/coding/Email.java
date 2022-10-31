package com.xworkz.things.coding;

public class Email {
	
	public int id;
	public String password;
	public long mobileNo;
	public Company company=new Company("Construction company","Raj");
	
	public Email(int id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public Email() {
		
	}
	public void showOff() {
		
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		 
		company.display();	
	}
	
	

}
