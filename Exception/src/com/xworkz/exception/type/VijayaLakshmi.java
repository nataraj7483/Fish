package com.xworkz.exception.type;

import com.xworkz.exception.rules.KarnatakaRTO;

public  class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {
	
	public VijayaLakshmi(String name,int age,String location,long mobileNo,String state) {
		super(name,age,location,mobileNo,state);
	}
	
	@Override
	public boolean paidTax(double amount) {
		System.out.println("running paidtax");
		return false;
	}
	
	@Override
	public double gst() {
		System.out.println("running gst");
		return 0;
	}
	
	@Override
	public double vat() {
		System.out.println("running vat");
		return 0;
	}
	
	@Override
	public void training() {
		System.out.println("running training");
	}
	
	@Override
	public void executeProgram() {
		System.out.println("running program execution");
	}

}
