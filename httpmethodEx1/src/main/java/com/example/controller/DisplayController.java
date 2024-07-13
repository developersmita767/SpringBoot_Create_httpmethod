package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayController {
	@GetMapping("/index")
	public String showIndexPage() {
		return"index";
	}
		@GetMapping("/contact")
		public String contact() {
			return"contact";
		}
		@GetMapping("/about")
		public String about() {
			return"about";
			
		}
		@PostMapping("/feedback")
		public String feedback() {
			return"feedback";
			
		}
	
}
