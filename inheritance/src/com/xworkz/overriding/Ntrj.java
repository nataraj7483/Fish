package com.xworkz.overriding;

public class Ntrj extends Director{
	
	public String directorColor;
	
	public Ntrj(String name,String directionOf,String directorColor) {
		super(name,directionOf);
		this.directorColor=directorColor;
	}
    public void display() {
    	super.display();
    	System.out.println(directorColor);
    }
}
