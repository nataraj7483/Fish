package com.xworkz.overriding;

public class Raj extends Criminall{
	
	public int kaidiNo;
	
	public Raj(String crime,int noOfCrime,int kaidiNo) {
		super(crime,noOfCrime);
		this.kaidiNo=kaidiNo;
		
	}
public void display() {
	super.display();
	System.out.println(kaidiNo);
}
}
