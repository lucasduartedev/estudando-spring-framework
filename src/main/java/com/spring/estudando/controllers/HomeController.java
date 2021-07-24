package com.spring.estudando.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"", "/", "index"})
	public String home() {
//		return "<h1>Página Home</h1>";
		return "index";
	}

}
