package com.github.pedrotony.study_thymeleaf.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.github.pedrotony.study_thymeleaf.model.Pessoa;
import com.github.pedrotony.study_thymeleaf.model.SexoType;

public class PessoaMockup {
	
	public static List<Pessoa> list() {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1L, "Sr.Batata", LocalDate.now(), SexoType.M));
		pessoas.add(new Pessoa(2L, "Sra.Batata", LocalDate.now(), SexoType.F));
		pessoas.add(new Pessoa(3L, "Mr.Potato", LocalDate.now(), SexoType.M));
		pessoas.add(new Pessoa(4L, "Mrs.Potato", LocalDate.of(1999, 12, 5) , SexoType.F));
		return pessoas;
	}
	
}
