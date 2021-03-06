package com.spring.estudando.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.estudando.models.Pessoa;
import com.spring.estudando.repositories.PessoaRepository;

@RestController
public class PessoaRestController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	// Filtrar por nome
	@GetMapping("/filtro")
	public List<Pessoa> findByName(@RequestParam("name") String name) {
		
		return this.pessoaRepository.findByNomeContains(name);
		
	}
	
	@GetMapping("/data")
	public List<Pessoa> findByData(@RequestParam("datanasc") String datanasc) {
		return this.pessoaRepository.findByDataNasc(datanasc);
	}
	
	@GetMapping("/entre/data")
	public List<Pessoa> findBetweenBirthday(
			@RequestParam("data1") String data1,
			@RequestParam("data2") String data2) {
		return this.pessoaRepository.findByBetweenBirthday(data1, data2);
	}
	

}
