package com.loiane.cursojava.aula31.alt;

import com.loiane.cursojava.aula31.Carro;

public class TesteCarroAlt {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		System.out.println(carro.modelo);
		System.out.println(carro.numPassageiros);
	
		carro.exibirAutonomia();
	}

}
