package com.spring.estudando.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrosHTTPController {
	
	@RequestMapping(value = {"*", "*/*"})
	public String paginaError() {
		return "erroshttp/erros";
	}

}
