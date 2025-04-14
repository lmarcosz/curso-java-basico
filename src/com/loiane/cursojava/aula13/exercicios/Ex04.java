package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float nota1 = scan.nextFloat();
		System.out.print("Nota 2: ");
		float nota2= scan.nextFloat();
		System.out.print("Nota 3: ");
		float nota3 = scan.nextFloat();
		System.out.print("Nota 4: ");
		float nota4 = scan.nextFloat();
		
		float mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média final = " + mediaFinal);
	}

}
