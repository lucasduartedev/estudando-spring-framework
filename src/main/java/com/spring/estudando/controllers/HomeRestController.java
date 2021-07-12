package com.spring.estudando.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HomeRestController {
	
	@GetMapping("/controller")
	public String home() {
		return "<p>Página retornada por um método usando a anotação <strong>@RestController</strong> no formato JSON.</p>";
	}

}
