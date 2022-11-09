package com.xworkz.overriding;

public class Moon extends Satellite{
	
	public String shape;
	
	public Moon(String name,double expenditure,String shape) {
		super(name,expenditure);
		this.shape=shape;
		
	}
	public void display() {
		super.display();
		System.out.println(shape);
	}

}
