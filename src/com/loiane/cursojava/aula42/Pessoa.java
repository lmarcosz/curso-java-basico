package com.loiane.cursojava.aula42;

public final class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	protected String nomeVisibilidade;
	
	public String obterEtiquetaEndereco() {
		return endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
