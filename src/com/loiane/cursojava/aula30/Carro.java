package com.loiane.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
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
		System.out.println("Construtor com 3 parâmetros foi chamado!");
	}
	
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Construtor com 2 parâmetros foi chamado!");
	}


	void exibirAutonomia() {
		System.out.println("A autônomia do carro é: "+(this.capCombustivel*this.consumoCombustivel)+ " Km");
	}
	
	double obterAutonomia() {
		this.exibirAutonomia();
		return this.capCombustivel*this.consumoCombustivel;
	}
	
}
