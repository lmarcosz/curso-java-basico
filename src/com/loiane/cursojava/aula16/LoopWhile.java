package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 1;
		int max = 20;
		
		System.out.println("Contando até " + max);		
		while(i<=max) {
			System.out.println(i++);
		}
		
		i=1;
		
		System.out.println("Contando até " + max);		
		do {
			System.out.println(i++);
		} while(i<=max);
		
	}

}
