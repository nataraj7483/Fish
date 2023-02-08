package com.xworkz.nataraj.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.nataraj.dto.BeverageDTO;
import com.xworkz.nataraj.dto.ChatDTO;
import com.xworkz.nataraj.dto.EducationDTO;
import com.xworkz.nataraj.dto.FamilyDTO;
import com.xworkz.nataraj.dto.MobileDTO;

@Component
@RequestMapping("/")
public class NatarajController {
	
	public NatarajController() {
		System.out.println("Running Controller ");
	}

	@GetMapping("/email")

	public String onEmail(Model model) {

		model.addAttribute("email", "snataraj7483@gmail.com");

		return "index.jsp";
	}

	@GetMapping("/nataraj")

	public String onMobile(Model model) {

		model.addAttribute("nataraj", "vivo");

		return "index.jsp";
	}

	@GetMapping("/aadhar")

	public String onAadar(Model model) {

		model.addAttribute("aadhar", "8985676656389");

		return "index.jsp";
	}

	@GetMapping("/age")

	public String onAge(Model model) {

		model.addAttribute("age", "24");

		return "index.jsp";
	}

	@GetMapping("/date")

	public String onDate(Model model) {

		model.addAttribute("date", LocalDateTime.of(1999, 04, 04, 12, 00));

		return "index.jsp";
	}

	@GetMapping("/salary")

	public String onSalary(Model model) {

		model.addAttribute("salary", 3000);

		return "index.jsp";
	}

	@GetMapping("/best")

	public String onBestFriend(Model model) {

		List<String> list = Stream
				.of("shdh", "jsddh", "jkhjh", "tyr", "tty", "trt", "tyrt", "Raj")
				.collect(Collectors.toList());
		model.addAttribute("list", list);

		return "index.jsp";
	}

	@GetMapping("/place")

	public String onPlace(Model model) {

		List<String> place = Stream.of("Hosadurga", "Chitradurga", "Vanivilasa", "Bangalore").collect(Collectors.toList());
		model.addAttribute("place", place);

		return "index.jsp";
	}

	@GetMapping("/set")

	public String onSkillSet(Model model) {

		List<String> set = Stream
				.of("DataType", "Chitradurga", "Variable", "JDK", "JVM", "JRE", "Constructor", "Chaining", "Method",
						"This", "Super", "Inheritence", "Polymorphisam", "Overloading", "Overriding", "Encapsulation",
						"Abstraction", "Interface", "Abstract", "Collection", "ArrayList", "LinkedList", "Set", "Queqe",
						"HashSet", "Linked Hash Set", "TreeSet", "Map", "CirclurQueue", "SortedMap", "Treemap",
						"HashTable", "Linked Hash table", "Spring", "Jpa", "JSp", "Servelet")
				.collect(Collectors.toList());
		model.addAttribute("set", set);

		return "index.jsp";
	}

	@GetMapping("/education")

	public String onEcucation(Model model) {

		EducationDTO dto = new EducationDTO("BE","Tipture","Tipture","Mechanical",2022,"Tumkur","52214","2022","Mechanical","KIT");
		model.addAttribute("dto", dto);

		return "index.jsp";
	}

	@GetMapping("/chat")

	public String onChat(Model model) {

		ChatDTO dto = new ChatDTO("Raj", "Nataraj", 98687687687L, "NTRJ", "Offline", "9days", "Instagram", false,
				"Jio", false);
		model.addAttribute("chat", dto);

		return "index.jsp";
	}

	@GetMapping("/mobiles")

	public String onMobileDTO(Model model) {

		MobileDTO dto = new MobileDTO("Oppo", "Oppo", 2022, "Indian", "2020-12-23");
		model.addAttribute("mobiles", dto);

		return "index.jsp";
	}

	@GetMapping("/beverage")

	public String onBeverage(Model model) {

		BeverageDTO dto = new BeverageDTO("Mango", "mango", "Navven", "20124sdc", 99007, "Raj", "Karnataka");
		model.addAttribute("beverage", dto);

		return "index.jsp";
	}

	@GetMapping("/family")

	public String onFamily(Model model) {

		FamilyDTO dto = new FamilyDTO("Nataraj", "Chandru", "FG", "ghfg", "Hosadurga", "Chitradurga",
				"Mathodu", "Raj", "NTRJ");
		model.addAttribute("family", dto);

		return "index.jsp";
	}

}
