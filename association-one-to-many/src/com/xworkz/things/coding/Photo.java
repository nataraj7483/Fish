package com.xworkz.things.coding;

public class Photo {

	private String name="Canon";
	public int   series;
	private String company="Canon";
	public int    noOfVersion;
	public boolean readiator;
	public int     fps;
	public String chipSet;
	public String graphicsEngine;
	public int    memoryInterface;
	public String speed;
	public Photo(int series, int noOfVersion, boolean readiator, int fps, String chipSet, String graphicsEngine,
			int memoryInterface, String speed) {
		super();
		this.series = series;
		this.noOfVersion = noOfVersion;
		this.readiator = readiator;
		this.fps = fps;
		this.chipSet = chipSet;
		this.graphicsEngine = graphicsEngine;
		this.memoryInterface = memoryInterface;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showOff() {
		 System.out.println(this.series);
		 System.out.println(this.noOfVersion);
		 System.out.println(this.readiator);
		 System.out.println(this.fps);
		 System.out.println(this.chipSet);
		 System.out.println(this.graphicsEngine);
		 System.out.println(this.memoryInterface);
		 System.out.println(this.speed);
		
	}
}
