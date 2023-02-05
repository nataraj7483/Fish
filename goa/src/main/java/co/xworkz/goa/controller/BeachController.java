package co.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachController {
	
	public BeachController() {
		System.out.println("Running BeachControl:" +getClass().getSimpleName());
	}
	@PostMapping
	public String BeachController(BeachDTO beachDTO, Model model) {
		System.out.println("Running casino:" +beachDTO);
		System.out.println("name:" +beachDTO.getName());
		System.out.println("name:" +beachDTO.getLocation());
		System.out.println("name:" +beachDTO.getClean());
		System.out.println("name:" +beachDTO.getGames());


		
		return "BeachSucces.jsp";
		
	}


}
