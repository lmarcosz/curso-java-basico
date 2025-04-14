package com.loiane.cursojava.aula35;

public class Calculadora {

	public static int fatorialNaoRecursivo(int x) {
		int fat = 1;
		for(int i=x; i>0; i--) {
			fat *= i;
		}
		return fat;
	}
	
	public static int fatorial(int x) {
		
		if(x==0) {
			return 1;
		}
		
		return x * fatorial(x-1);
	}
	
}
