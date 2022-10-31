package com.has.coding.constant;

public enum MangoColor {
	YELLOW(2),GREEN(4),RED(8);

	public int quantity;
	private MangoColor(int quantity) {
		this.quantity=quantity;
		
	}
	
}
