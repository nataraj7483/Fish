package com.xworkz.collection.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable{
	
	private String name;
	private String langauge;
	private double budget;
	private double profit;
	public MovieDTO() {
		super();
	}
	public MovieDTO(String name, String langauge, double budget, double profit) {
		super();
		this.name = name;
		this.langauge = langauge;
		this.budget = budget;
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", langauge=" + langauge + ", budget=" + budget + ", profit=" + profit + "]";
	}
	@Override
	public int hashCode() {
		return 20;
	}
	public boolean equals(Object obj) {
		 if(obj!=null) {
			 if(obj instanceof MovieDTO) {
				 MovieDTO dto=(MovieDTO)obj;
				 if(dto.name.equals(this.name)&& dto.langauge.equals(this.langauge)) {
					 System.out.println(dto);
					 return true;
				 }
			 }
		 }
		 return false; 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	
}
