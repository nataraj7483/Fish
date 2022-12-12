package com.xworkz.exception.boot;

import com.xworkz.exception.type.VijayaLakshmi;

public class XworkzRuleRunner {

	public static void main(String[] args) {
		
		VijayaLakshmi vijayaLakshmi=new VijayaLakshmi("Raj",23,"NewDurga",8975998,"Karnataka");
		vijayaLakshmi.display();
		
		System.out.println(System.lineSeparator());
		System.out.println("running Override");
		vijayaLakshmi.paidTax(75894);
		vijayaLakshmi.gst();
		vijayaLakshmi.vat();
		vijayaLakshmi.training();
		vijayaLakshmi.executeProgram();
		vijayaLakshmi.eat();
		
		System.out.println(System.lineSeparator());
		vijayaLakshmi.completedProgram();
		vijayaLakshmi.upLoadedTask();
		vijayaLakshmi.training();
		vijayaLakshmi.executeProgram();
	}

}
