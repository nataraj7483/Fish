package com.xworkz.coding.boot;

import com.xworkz.coding.Constant.Type;
import com.xworkz.coding.code.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet=new Sweet(Type.RAVA);
		sweet.setCostly(true);
		sweet.weight=7.8;
		sweet.Showoff();
		

	}

}
