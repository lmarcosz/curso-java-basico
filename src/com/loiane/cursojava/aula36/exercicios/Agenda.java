package com.loiane.cursojava.aula36.exercicios;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public void infoTodosOsContatos() {
		System.out.println("\n" + "Contados de " + this.nome);
		for(Contato c: this.contatos) {
			c.infoContato();
		}
	}
	
}
