package com.loiane.cursojava.aula31;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		System.out.println(carro.numPassageiros);
	
		carro.exibirAutonomia();
		carro.obterAutonomia();
		
	}

}
