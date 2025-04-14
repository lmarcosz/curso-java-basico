package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		int max = 20;
		
		System.out.println("Contando até " + max);
		for(int i=0; i<=max; i++) {
			System.out.println(i);
		}
		
		for(int i=max; i>=0; i--) {
			System.out.println(i);
		}
		
		for(int i=0, j=10; i<j; i++, j--) {
			System.out.println("Valor de i = " + i + " e valor de j = " + j);
		}
		
		int i=0;
		for(; i<5;) {
			System.out.println(i++);
		}
	}

}
