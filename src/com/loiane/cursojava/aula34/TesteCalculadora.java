package com.loiane.cursojava.aula34;

public class TesteCalculadora {

	static int resultSoma;
	
	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(5, 3, 8);
		
		mostrarSoma(resultSoma);
		
	}
	
	static void mostrarSoma(double resultSoma) {
		System.out.println(resultSoma);
	}

}
