package com.mballen.curso.boot.Resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("idade")
	private String idade;
	


	
	@Override
	public String toString() {
		return "NutricionistaResource [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	@JsonProperty("telefone") 
	String telefone;
	
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	


}
