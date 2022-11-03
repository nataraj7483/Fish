package com.xworkz.things.coding;

public class Temple {

	private String name="Sai Ba Ba";
	public int   noOfBhakts ;
	private String trust="Sai ba ba trust";
	public int    noOfVersion;
	public int    timing;
	public int     noOfBells;
	public String godName;
	public String festival;
	public int    memoryInterface;
	public String parkingArea ;
	public String hotelsNearTemple;
	public Temple(int noOfBhakts, int noOfVersion, int timing, int noOfBells, String godName, String festival,
			int memoryInterface, String parkingArea, String hotelsNearTemple) {
		super();
		this.noOfBhakts = noOfBhakts;
		this.noOfVersion = noOfVersion;
		this.timing = timing;
		this.noOfBells = noOfBells;
		this.godName = godName;
		this.festival = festival;
		this.memoryInterface = memoryInterface;
		this.parkingArea = parkingArea;
		this.hotelsNearTemple = hotelsNearTemple;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrust() {
		return trust;
	}
	public void setTrust(String trust) {
		this.trust = trust;
	}
	public void showOff() {
		System.out.println(this.noOfBhakts);
		System.out.println(this.noOfVersion);
		System.out.println(this.timing);
		System.out.println(this.noOfBells);
		System.out.println(this.godName);
		System.out.println(this.festival);
		System.out.println(this.memoryInterface);
		System.out.println(this.parkingArea);
		System.out.println(this.hotelsNearTemple);
	}
	
	
}
