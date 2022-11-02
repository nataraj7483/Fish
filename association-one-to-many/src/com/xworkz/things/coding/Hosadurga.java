package com.xworkz.things.coding;

public class Hosadurga {
	
	private String districtName="Chitradurga";
	int noOfTq;
	private String tqName="Hosadurga";
	int noOfpanchayath;
	String mla;
	String mp;
	int noOfMembers;
	int totalVillages;
	String devotion;
	int noOfVillages;
	int totalPapulation;
	
	
	public Hosadurga(int noOfTq, int noOfpanchayath, String mla, String mp, int noOfMembers, int totalVillages,
			String devotion, int noOfVillages, int totalPapulation) {
		super();
		this.noOfTq = noOfTq;
		this.noOfpanchayath = noOfpanchayath;
		this.mla = mla;
		this.mp = mp;
		this.noOfMembers = noOfMembers;
		this.totalVillages = totalVillages;
		this.devotion = devotion;
		this.noOfVillages = noOfVillages;
		this.totalPapulation = totalPapulation;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getTqName() {
		return tqName;
	}
	public void setTqName(String tqName) {
		this.tqName = tqName;
	}
	public void showOff() {
		 System.out.println(this.noOfTq);
		 System.out.println(this.noOfpanchayath);
		 System.out.println(this.mla);
		 System.out.println(this.mp);
		 System.out.println(this.noOfMembers);
		 System.out.println(this.totalVillages);
		 System.out.println(this.devotion);
		 System.out.println(this.noOfVillages);
		 System.out.println(this.totalPapulation);
		 
	}
	
	
	
	
	
	
	
	

}
