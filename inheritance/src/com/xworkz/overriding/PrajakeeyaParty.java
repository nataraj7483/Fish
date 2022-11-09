package com.xworkz.overriding;

public class PrajakeeyaParty extends PoliticienParty{
	
	public String cm;
	
	public PrajakeeyaParty(String name,String mainCandidate,String cm) {
		super(name,mainCandidate);
		this.cm=cm;
		
	}
	public void display() {
		super.display();
		System.out.println(cm);
	}

}
