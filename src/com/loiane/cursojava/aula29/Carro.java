package com.loiane.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//construtor padrão
	Carro(){
		System.out.println("Construtor chamado com sucesso!");
		numPassageiros = 4;
	}
	
	void exibirAutonomia() {
		System.out.println("A autônomia do carro é: "+(capCombustivel*consumoCombustivel)+ " Km");
	}
	
	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado");
		return capCombustivel*consumoCombustivel;
	}
	
}
