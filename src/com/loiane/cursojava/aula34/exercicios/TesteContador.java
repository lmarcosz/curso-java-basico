package com.loiane.cursojava.aula34.exercicios;

public class TesteContador {

	static void imprimirContador() {
		System.out.println(Contador.obterNum());
	}
	
	public static void main(String[] args) {
		
		imprimirContador();
		
		Contador.incrementarNum();
		imprimirContador();
		
		Contador.incrementarNum();
		imprimirContador();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
	
		imprimirContador();
		
	}

}
