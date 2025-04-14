package com.loiane.cursojava.aula34.exercicios;

public class TesteCalculadora {

	static void imprimirResultado(double res) {
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		
		imprimirResultado(Calculadora.somar(5, 8));
		imprimirResultado(Calculadora.subtrair(7, 8.4));
		imprimirResultado(Calculadora.multiplicar(5, 8));
		imprimirResultado(Calculadora.dividir(5, 0));
		imprimirResultado(Calculadora.potencia(3, 4));
		imprimirResultado(Calculadora.fatorial(6));
	}

}
