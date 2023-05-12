package com.github.pedrotony.study_thymeleaf.model;

import java.time.LocalDate;

public class Pessoa {
	
	private Long id;
	private String nome;
	private LocalDate dataNasc;
	private SexoType sexo;
	
	public Pessoa() {
	}
	
	public Pessoa(Long id, String nome, LocalDate dataNasc, SexoType sexo) {
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public SexoType getSexo() {
		return sexo;
	}
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	
}
