package com.spring.estudando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.estudando.models.Pessoa;
import com.spring.estudando.repositories.PessoaRepository;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@RequestMapping(value="/cadastrar", method=RequestMethod.GET)
	public String form() {
		return "pessoa/cadastropessoa";
	}
	
	@RequestMapping(value="/cadastrar", method=RequestMethod.POST)
	public String form(Pessoa pessoa) {
		
		// Verificar dados informados
		if(pessoa.getNome() == null || pessoa.getNome().isEmpty()) {
			return "redirect:/pessoas/cadastrar";			
		}
		
		pessoaRepository.save(pessoa);			
		
		// Redirecionar: lista de pessoas cadastradas
		return "redirect:/pessoas";
	}
	
	@RequestMapping
	public ModelAndView listaPessoas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Pessoa> pessoas = pessoaRepository.findAll();
		mv.addObject("pessoas", pessoas);
		return mv;
	}
	
	// Pesquisa por filtro
	@RequestMapping("/filtrar")
	public ModelAndView filtrarPessoas(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Pessoa> pessoas = pessoaRepository.findByNomeContains(name);
		mv.addObject("pessoas", pessoas);
		return mv;
	}
	
	
}
