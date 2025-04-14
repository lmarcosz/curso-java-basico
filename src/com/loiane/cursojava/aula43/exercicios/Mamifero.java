package com.loiane.cursojava.aula43.exercicios;

public class Mamifero extends Animal{

	private String alimento;
	
	public Mamifero(String nome, double comprimento, int numPatas, String cor, double velocidade, String alimento) {
		super(nome, comprimento, numPatas, cor, "Terra", velocidade);
		this.setAlimento(alimento);
	}
	
	public Mamifero(String nome, double comprimento, int numPatas, String cor, double velocidade) {
		super(nome, comprimento, numPatas, cor, "Terra", velocidade);
	}
	
	public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {
		super(nome, comprimento, 4, cor, "Terra", velocidade);
		this.setAlimento(alimento);
	}
	
	public Mamifero(String nome, double comprimento, String cor, double velocidade) {
		super(nome, comprimento, 4, cor, "Terra", velocidade);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void imprimirInfo() {
		String s = super.info();
		if(alimento != null) {
			s += "\nAlimento: " + alimento;
		}
		s += "\n--------------------------";
		System.out.println(s);
	}
	
}
