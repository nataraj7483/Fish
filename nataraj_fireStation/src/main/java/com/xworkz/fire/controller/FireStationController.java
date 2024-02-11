package com.xworkz.fire.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.fire.dto.FireStationDTO;
import com.xworkz.fire.service.FireStationService;

@Controller
@RequestMapping("/")
public class FireStationController {
	
	
	@Autowired
	private FireStationService fireStationService;
	
	private List<Integer> fireStationNo =Arrays.asList(234,889,867,8676);
	private List<Integer> noOfVehicles =Arrays.asList(4,9,5,2);
	
	public FireStationController() {
		System.out.println("Created "+ getClass().getSimpleName());
	}
	
	@GetMapping("/fire")
	public String onFire(Model model) {
		
		System.out.println("Running onfire...");
		model.addAttribute("fireStationNo", fireStationNo);
		model.addAttribute("noOfVehicles", noOfVehicles);
		return "Fire";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id "+ id);
		FireStationDTO dto =fireStationService.findById(id);
		if(dto != null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message", "Data not found");
		}
		return "FireSearch";
	}
	
	@PostMapping("/fire")
		public String onFire(Model model, FireStationDTO dto) {
			System.out.println("Running onFire on post mapping "+ dto);
			Set<ConstraintViolation<FireStationDTO>> violations= fireStationService.validateAndSave(dto);
			if(violations.isEmpty()) {
				System.out.println("No violation in controller go to succes page");
				return "Fire";
			}
			model.addAttribute("fireStationNo", fireStationNo);
			model.addAttribute("noOfVehicles", noOfVehicles);
			model.addAttribute("dto", dto);
			System.out.println("Violations in controller");
			return "Fire";
	
	}
	@GetMapping("/searchByStationName")
	public String onSearchByName(@RequestParam String stationName, Model model) {
		System.out.println("Running on Search for stationName "+ stationName);
		List<FireStationDTO> dto = fireStationService.findByStationName(stationName);
		if(dto!= null ) {
			model.addAttribute("dto", dto);
			return "FireStationNameSearch";
			
		}else {
			model.addAttribute("message", "Data not found");
			return "FireStationNameSearch";
		}
		
	}
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running on update in get " +id);
		FireStationDTO dto= fireStationService.findById(id);
		model.addAttribute("fireStationNo", fireStationNo);
		model.addAttribute("noOfVehicles", noOfVehicles);
		model.addAttribute("dto", dto);
		return "UpdateFireStation";
	}
	
	@PostMapping("/update")
	public String onUpdate(FireStationDTO dto, Model model) {
		System.out.println("Running on update in post " + dto);
		Set<ConstraintViolation<FireStationDTO>> violations =fireStationService.validateAndSave(dto);
		if(violations.size()>0) {
			model.addAttribute("errors", violations);
		}else {
			model.addAttribute("message", "FireStation update success");
		}
		return "UpdateFireStation";
	}
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("Running on delete in post");
	
		FireStationDTO dto = fireStationService.deleteById(id);
		if(dto !=null) {
			model.addAttribute("delete", dto);
			model.addAttribute("id",id);
			return "Delete";
		}else {
			model.addAttribute("message", "Data not found");
			return "UpdateFireStation";
		}
	}
	
	

}
