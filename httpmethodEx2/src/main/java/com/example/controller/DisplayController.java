package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("display")
public class DisplayController {
	@GetMapping("/index")
	public String showIndexPage() {
		return"index";
	}
	@GetMapping("/about")
	public String about(@RequestParam String name, @RequestParam int age,@RequestParam String address) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		return"about";
	}

}
