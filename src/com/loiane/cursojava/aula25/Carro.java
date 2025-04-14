package com.loiane.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autônomia do carro é: "+(capCombustivel*consumoCombustivel)+ " Km");
	}
	
}
