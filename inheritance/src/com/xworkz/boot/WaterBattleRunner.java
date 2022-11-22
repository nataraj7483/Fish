package com.xworkz.boot;

import com.xworkz.things.equales.WaterBattle;

public class WaterBattleRunner {

	public static void main(String[] args) {

		WaterBattle waterBattle=new WaterBattle("Kinly","white",2,25,"waterbottle",true,true,2022-5-6,2023-7-9,true);
		System.out.println(waterBattle);
		
		WaterBattle waterBattle1=new WaterBattle("Kinly","white",5,30,"waterbottle",false,false,2022-9-6,2023-8-9,true);
		System.out.println(waterBattle1);
	}

}
