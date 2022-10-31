package com.xworkz.things.coding;

public class Location {
	
	public int no;
	public String street;
	public Country country=new Country("India","Droupadi murmu",29,29);
	public City city=new City("Bangalore","Raj",560034,"Gaali Anjaneyya");
	public State state=new State("Karnataka",30,"Bommayi","Bangalore");
	
	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;
	}
	public Location() {
		
	}
	public void showOff() {
		 System.out.println(this.no);
		 System.out.println(this.street);
		 country.showOff();
		 city.showOff();
		 
		 state.showOff();
		 
		 
		 
	}
	
	
	

}
