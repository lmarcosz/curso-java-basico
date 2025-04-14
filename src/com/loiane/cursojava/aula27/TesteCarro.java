package com.loiane.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Quantidade de combustível para:");
		System.out.println("- 10 Km: " + qtdCombustivel10);
		System.out.println("- 15 Km: " + qtdCombustivel15);
		
	}

}
