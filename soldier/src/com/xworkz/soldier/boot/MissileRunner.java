package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {

		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service = context.getBean(MissileService.class);
		
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println("saved "+ saved);

		
	}

}
