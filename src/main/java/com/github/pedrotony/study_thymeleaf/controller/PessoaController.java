package com.github.pedrotony.study_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pedrotony.study_thymeleaf.model.Pessoa;
import com.github.pedrotony.study_thymeleaf.repository.PessoaMockup;


@Controller
@RequestMapping(path = "/pessoas")
public class PessoaController {
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("pessoa", new Pessoa());
		return "pessoa/form.html";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("pessoas", PessoaMockup.list());
		return "pessoa/list.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Pessoa pessoa, Model model) {
		model.addAttribute("pessoa", new Pessoa());
		System.out.println(pessoa.getId());
		System.out.println(pessoa.getNome());
		return "pessoa/form.html";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String pessoa() {
		return "pessoa";
	}
	
	
}
