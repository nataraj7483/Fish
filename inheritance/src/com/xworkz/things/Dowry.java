package com.xworkz.things;

public class Dowry {
	
    public String receiver;
    public double price;
    public String donor;
    public Dowry() {
    	
    	System.out.println("Created default constructor of dowry class");
    }
    public Dowry(String receiver,double price,String donor) {
    	super();
    	this.receiver=receiver;
    	this.price=price;
    	this.donor=donor;
    	System.out.println("created parameterised constructor of dowry class file");
    	
    }
    public void print() {
    	System.out.println(this.receiver);
    	System.out.println(this.price);
    	System.out.println(this.donor);
    }



}
