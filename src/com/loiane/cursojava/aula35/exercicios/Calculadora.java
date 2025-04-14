package com.loiane.cursojava.aula35.exercicios;

public class Calculadora {

	public static int fibonacci(int n) {
		if(n<2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	public static int somatorio(int n) {
		if(n==0) {
			return 0;
		}
		return n + somatorio(n-1);
	}
	
}
