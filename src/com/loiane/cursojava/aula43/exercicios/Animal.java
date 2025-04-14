package com.loiane.cursojava.aula43.exercicios;

public class Animal {

	private String nome;
	private double comprimento;
	private int numPatas = 4;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	protected String info() {
		String s = "Animal: ";
		s += nome + "\nComprimento: ";
		s += comprimento + " cm\nPatas: ";
		s += numPatas + "\nCor: ";
		s += cor + "\nAmbiente: ";
		s += ambiente + "\nVelocidade: ";
		s += velocidade + " m/s";
		return s;
	}
	
	public void imprimirInfo() {
		String s = this.info();
		s += "\n--------------------------";
		System.out.println(s);
	}
	
}
