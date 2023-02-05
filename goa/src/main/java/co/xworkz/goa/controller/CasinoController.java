package co.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/casino")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("Running CasinoControl:" +getClass().getSimpleName());
	}
	@PostMapping
	public String CasinoController(CasinoDTO casinoDTO, Model model) {
		System.out.println("Running casino:" +casinoDTO);
		System.out.println("name:" +casinoDTO.getName());
		System.out.println("name:" +casinoDTO.getCasino());
		System.out.println("name:" +casinoDTO.getFreeFood());
		System.out.println("name:" +casinoDTO.getFreeAlcohol());
		System.out.println("name:" +casinoDTO.getEntryFees());


		
		return "Casino.jsp";
		
	}

}
