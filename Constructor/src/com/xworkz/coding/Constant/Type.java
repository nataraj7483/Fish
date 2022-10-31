package com.xworkz.coding.Constant;

public enum Type {
	
	RAVA(false),MAIDA(true), GODI(false), DRYFRUIT(true);
	public boolean favourite;
	private Type(boolean fav) {
		favourite=fav;
	}

}
