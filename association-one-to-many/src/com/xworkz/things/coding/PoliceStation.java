package com.xworkz.things.coding;

public class PoliceStation {

	private String Area="Koramangla";
	int noOfpolice;
	private String stationName="KoramgalaPoliceStation";
	int noOfCells;
	String SubInspector;
	String assiSubinspector;
	int noOfConstables;
	int totalJeeps;
	String SnacherName;
	int noOfGuns;
	int totalLadyConstables;
	public PoliceStation(int noOfpolice, int noOfCells, String subInspector, String assiSubinspector,
			int noOfConstables, int totalJeeps, String snacherName, int noOfGuns, int totalLadyConstables) {
		super();
		this.noOfpolice = noOfpolice;
		this.noOfCells = noOfCells;
		this.SubInspector = subInspector;
		this.assiSubinspector = assiSubinspector;
		this.noOfConstables = noOfConstables;
		this.totalJeeps = totalJeeps;
		this.SnacherName = snacherName;
		this.noOfGuns = noOfGuns;
		this.totalLadyConstables = totalLadyConstables;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public void showOff() {
		
		System.out.println(this.noOfpolice);
		System.out.println(this.noOfCells);
		System.out.println(this.SubInspector);
		System.out.println(this.assiSubinspector);
		System.out.println(this.noOfConstables);
		System.out.println(this.totalJeeps);
		System.out.println(this.SnacherName);
		System.out.println(this.noOfGuns);
		System.out.println(this.totalLadyConstables);
	}
	
}
