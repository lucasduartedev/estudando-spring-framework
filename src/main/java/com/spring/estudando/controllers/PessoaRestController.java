package com.spring.estudando.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.estudando.models.Pessoa;
import com.spring.estudando.repositories.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaRestController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	// Apenas para teste de funcionamento
	@GetMapping("/test")
	public String test() {
		return "Controller: 'PessoaContrller'";
	}
	
	@GetMapping
	public List<Pessoa> pessoas() {
		return pessoaRepository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public String cadastrarPessoa(Pessoa pessoa) {
		
		pessoaRepository.save(pessoa);
		return "Pessoa Cadastrada, ou não!";
		
	}

}
