package com.xworkz.overriding;

public class PoliticienParty {
	
	public String name;
	public String mainCandidate;
	
	public PoliticienParty(String name, String mainCandidate) {
		super();
		this.name = name;
		this.mainCandidate = mainCandidate;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.mainCandidate);
	}
	

}
