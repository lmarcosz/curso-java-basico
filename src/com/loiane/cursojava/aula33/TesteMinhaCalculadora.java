package com.loiane.cursojava.aula33;

public class TesteMinhaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(6, 6)); //Retorna 12
		System.out.println(calc.soma(6, 6, 3)); //Retorna 15
		System.out.println(calc.soma(6.3, 6.9)); //Retorna 13.2
	}

}
