package com.has.coding.code;

public class Weapon {
	
	public String name;
	public String use;
	public int weight;
	
	public Weapon(String name,String use,int weight) {
		super();
		this.name=name;
		this.use=use;
		this.weight=weight;
	}
	public void expose() {
		System.out.println(this.name);
		System.out.println(this.use);
		System.out.println(this.weight);
	}

}
