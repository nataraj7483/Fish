package com.xworkz.things.coding;

public class Job {
	
	public int salary;
	public String role;
	public int bond;
	public Company company=new Company("Construction company","Raj");
	public Job(int salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	public Job() {
		
	}
	
	public void display() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		
		company.display();
	}

}
