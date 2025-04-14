package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = input.nextDouble();
		
		if(valor>0) {
			System.out.println("O número "+ valor + " é positivo!");
		}
		else if(valor<0) {
			System.out.println("O número "+ valor + " é negativo!");	
		}
		else {
			System.out.println("O número "+ valor + " é nulo!");
		}
		
	}

}