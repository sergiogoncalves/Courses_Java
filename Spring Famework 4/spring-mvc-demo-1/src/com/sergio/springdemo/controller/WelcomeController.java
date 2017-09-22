package com.sergio.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sergio.springdemo.service.demo.GenericWelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;

	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		List<String> message = welcomeService.getWelcomeMessage("Sérgio Gonçalves");
		
		System.out.println(message);
		
		
		model.addAttribute("arrivedMessage", "Arrived");
		
		return "chegou";
	}
}
