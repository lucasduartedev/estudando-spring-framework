package com.spring.estudando.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos/http")
public class MetodosHTTP {
	
	@GetMapping("/get")
	public String metodoGet() {
		return "Retorno via método Get";
	}

	@PostMapping("/post")
	public String metodoPost() {
		return "Retorno via método Post";
	}

	@PutMapping("/put")
	public String metodoPut() {
		return "Retorno via método Put";
	}

	@PatchMapping("/patch")
	public String metodoPatch() {
		return "Retorno via método Patch";
	}

	@DeleteMapping("/delete")
	public String metodo() {
		return "Retorno via método Delete";
	}

}
