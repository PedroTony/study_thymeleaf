package com.github.pedrotony.study_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pedrotony.study_thymeleaf.model.Pessoa;


@Controller
@RequestMapping(path = "/pessoas")
public class PessoaController {
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
		return "pessoa/form.html";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		return "pessoa/list.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute Pessoa pessoa) {
		System.out.println(pessoa.getNome());
		return "pessoa/form.html";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String pessoa() {
		return "pessoa";
	}
	
	
}
