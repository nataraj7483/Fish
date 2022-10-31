package com.has.coding.code;

public class God {
	
	public String name;
	public String gender;
	public String mainpower;
	public Weapon weapon= new Weapon("archer","for the war",20000);
	
	public God(String name,String gender,String mainpower) {
		super();
		this.name=name;
		this.gender=gender;
		this.mainpower=mainpower;
	}
	public void exposeAll() {
		
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainpower);
		
		if(weapon!=null) {
			weapon.expose();
			weapon.name="Rama";
			System.out.println(weapon.name);
		}
		else {
			System.out.println("weapon is pointing to null");
		}
		
	}
	

}
