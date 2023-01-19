package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService service = context.getBean(ResortService.class);
		
		boolean saved = service.validateAndSave(new ResortDTO());
		System.out.println("saved "+ saved);


	}

}
