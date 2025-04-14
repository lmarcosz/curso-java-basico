package com.loiane.cursojava.aula29;

public class Carro2 {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//construtor com parâmetros
	Carro2(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
	void exibirAutonomia() {
		System.out.println("A autônomia do carro é: "+(capCombustivel*consumoCombustivel)+ " Km");
	}
	
	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado");
		return capCombustivel*consumoCombustivel;
	}
}
