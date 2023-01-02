package com.xworkz.collection.dto;

import java.io.Serializable;

public class DaugheterDTO implements Serializable{
	
	private String daughterName;
	private long mobileNo;
	private int daughterage;
	private boolean committed;
	private boolean alive;
	public DaugheterDTO() {
		super();
	}
	public DaugheterDTO(String daughterName, long mobileNo, int daughterage, boolean committed, boolean alive) {
		super();
		this.daughterName = daughterName;
		this.mobileNo = mobileNo;
		this.daughterage = daughterage;
		this.committed = committed;
		this.alive = alive;
	}
	
	@Override
	public int hashCode() {
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!= null) {
			if (obj instanceof DaugheterDTO) {
				if (daughterName.equals(this.daughterName)) {
					DaugheterDTO dto = (DaugheterDTO) obj;
					System.out.println(dto);
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "DaugheterDTO [daughterName=" + daughterName + ", mobileNo=" + mobileNo + ", daughterage=" + daughterage
				+ ", committed=" + committed + ", alive=" + alive + "]";
	}
	public String getDaughterName() {
		return daughterName;
	}
	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getDaughterage() {
		return daughterage;
	}
	public void setDaughterage(int daughterage) {
		this.daughterage = daughterage;
	}
	public boolean isCommitted() {
		return committed;
	}
	public void setCommitted(boolean committed) {
		this.committed = committed;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
