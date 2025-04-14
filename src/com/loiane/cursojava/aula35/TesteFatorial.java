package com.loiane.cursojava.aula35;

public class TesteFatorial {

	public static void main(String[] args) {
		
		int res = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(res);
		
		res = Calculadora.fatorial(5);
		System.out.println(res);
		
	}

}
