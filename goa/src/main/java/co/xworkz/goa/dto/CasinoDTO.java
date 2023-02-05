package co.xworkz.goa.dto;

public class CasinoDTO {
	
	private String name;
	private String casino;
	private String entryFees;
	private String freeFood;
	private String freeAlcohol;
	
	public CasinoDTO() {
		System.out.println("Running CasinoDTO:" +getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "CasinoDTO [name=" + name + ", casino=" + casino + ", entryFees=" + entryFees + ", freeFood=" + freeFood
				+ ", freeAlcohol=" + freeAlcohol + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCasino() {
		return casino;
	}

	public void setCasino(String casino) {
		this.casino = casino;
	}

	public String getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(String entryFees) {
		this.entryFees = entryFees;
	}

	public String getFreeFood() {
		return freeFood;
	}

	public void setFreeFood(String freeFood) {
		this.freeFood = freeFood;
	}

	public String getFreeAlcohol() {
		return freeAlcohol;
	}

	public void setFreeAlcohol(String freeAlcohol) {
		this.freeAlcohol = freeAlcohol;
	}
	

}
