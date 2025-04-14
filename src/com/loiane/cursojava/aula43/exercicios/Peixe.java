package com.loiane.cursojava.aula43.exercicios;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe(String nome, double comprimento, double velocidade) {
		super(nome, comprimento, 0, "Cinzento", "Mar", velocidade);
		this.setCaracteristicas("Barbatanas e Cauda");
	}
	
	public Peixe(String nome, double comprimento, String cor, double velocidade) {
		super(nome, comprimento, 0, cor, "Mar", velocidade);
		this.setCaracteristicas("Barbatanas e Cauda");
	}
	
	public Peixe(String nome, double comprimento, String cor, double velocidade, String caracteristicas) {
		super(nome, comprimento, 0, cor, "Mar", velocidade);
		this.setCaracteristicas(caracteristicas);
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public void imprimirInfo() {
		String s = super.info();
		if(caracteristicas != null) {
			s += "\nCaracterística: " + caracteristicas;
		}
		s += "\n--------------------------";
		System.out.println(s);
	}
	
}
