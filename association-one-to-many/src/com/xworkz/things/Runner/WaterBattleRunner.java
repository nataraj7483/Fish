package com.xworkz.things.Runner;

import com.xworkz.things.coding.Water;
import com.xworkz.things.coding.WaterBattle;

public class WaterBattleRunner {

	public static void main(String[] args) {
		
		Water water = new Water();
		WaterBattle acc = new WaterBattle();
		
		
		System.out.println(water. getName());
		System.out.println(water. getSeries());
		System.out.println(water. getCompany());
		System.out.println(water. getNoOfBottlePerSec());
		System.out.println(water. isReadiatorInFactory());
		System.out.println(water. getProductionPlant());
		System.out.println(water. getChipSet());
		System.out.println(water. getFactoryName());
		System.out.println(water. getEmployee());
		System.out.println(water. getPurity());
		
		System.out.println(System.lineSeparator());
		
		acc.bot(water);
		

	}

}
