package com.loiane.cursojava.aula31;

public class Carro {

	String marca;
	public String modelo;
	public int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		//System.out.println("Construtor com 3 parâmetros foi chamado!");
	}
	
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		//System.out.println("Construtor com 2 parâmetros foi chamado!");
	}

	public void exibirAutonomia() {
		System.out.println("A autônomia do carro é: "+ this.obterAutonomia() + " Km");
	}
	
	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
}
