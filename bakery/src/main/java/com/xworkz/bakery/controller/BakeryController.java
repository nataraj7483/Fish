package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@PostMapping("/bakery")
	public String onBakery(BakeryDTO bakeryDTO, Model model) {
		model.addAttribute("bakery" ,bakeryDTO);
		boolean saved = this.bakeryService.validateAndSave(bakeryDTO);
        System.out.println(saved);		

		return "Bakery";
	}


}
