package com.sergio.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		System.out.println("Chegou aqui");
		
		model.addAttribute("arrivedMessage", "Arrived");
		
		return "chegou";
	}
}
