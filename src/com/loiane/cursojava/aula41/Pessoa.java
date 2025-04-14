package com.loiane.cursojava.aula41;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	protected String nomeVisibilidade;
	
	public abstract String obterEtiquetaEndereco();
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
