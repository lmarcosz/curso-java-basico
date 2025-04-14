package com.loiane.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		System.out.println(carro.numPassageiros);
		
		Carro2 van = new Carro2("Fiat", "Ducato", 10, 100, 0.2);
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
	}
	
}
