package com.has.coding.code;

public class Temple {
	
	public String name;
	public String mainPriest;
	public String noOfVisitors;
	public God god = new God("Krishna","Male","one wife");
	
	public Temple(String name,String mainPriest,String noOfVisitors) {
		super();
		this.name=name;
		this.mainPriest=mainPriest;
		this.noOfVisitors=noOfVisitors;
	}
	public void thorsu(){
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitors);
		
		god.exposeAll();
		god.mainpower="Powerfull";
		
	}

}
