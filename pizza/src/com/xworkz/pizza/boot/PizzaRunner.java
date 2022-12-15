package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDTO pizzaDTO=new PizzaDTO();
		PizzaService pizzaService=new PizzaServiceImpl();
		pizzaDTO.setName("Neapolitan");
		pizzaDTO.setCompany("Neopolitan Pizza Limited");
		pizzaDTO.setPrice(100);
		pizzaDTO.setFlavour("Margherite");
		pizzaDTO.setChees(false);
		pizzaDTO.setSize(PizzaSize.SMALL);
		pizzaDTO.setType("Non Veg");
		pizzaDTO.setCreatedBy("Raj");
		pizzaDTO.setCreatedDate(LocalDateTime.now());
		pizzaDTO.setUpdatedBy("NTRJ");
		pizzaDTO.setUpdatedDate(LocalDateTime.now());
		
		pizzaService.create(pizzaDTO);

	}

}
