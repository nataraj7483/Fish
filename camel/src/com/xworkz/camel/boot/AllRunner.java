package com.xworkz.camel.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.camel.bean.HardwareShop;
import com.xworkz.camel.bean.Pencil;
import com.xworkz.camel.bean.Rubber;
import com.xworkz.camel.bean.Software;
import com.xworkz.camel.bean.SoftwareEngineer;
import com.xworkz.camel.configuration.HardwareConfiguration;

public class AllRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(HardwareConfiguration.class);

		HardwareShop ref1 = container.getBean("hardware", HardwareShop.class);
		System.out.println(ref1);
		Software ref2 = container.getBean("software", Software.class);
		System.out.println(ref2);
		SoftwareEngineer ref3 = container.getBean("engineer", SoftwareEngineer.class);
		System.out.println(ref3);
		Pencil ref4 = container.getBean("pencil", Pencil.class);
		System.out.println(ref4);
		Rubber ref5 = container.getBean("rubber", Rubber.class);
		System.out.println(ref5);
		
	}

}
