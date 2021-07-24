package com.spring.estudando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.estudando.models.Pessoa;
import com.spring.estudando.repositories.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@RequestMapping(value="/pessoas/cadastrar", method=RequestMethod.GET)
	public String form() {
		return "pessoa/cadastropessoa";
	}
	
	@RequestMapping(value="/pessoas/cadastrar", method=RequestMethod.POST)
	public String form(Pessoa pessoa) {
		
		pessoaRepository.save(pessoa);
		
		return "redirect:/pessoas/cadastrar";
	}
	
	@RequestMapping("/pessoas")
	public ModelAndView listaPessoas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Pessoa> pessoas = pessoaRepository.findAll();
		mv.addObject("pessoas", pessoas);
		return mv;
	}

}
