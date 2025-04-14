package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = input.next().charAt(0);
		
		switch(letra) {
			case 'F': System.out.println("F - Feminino"); break;
			case 'M': System.out.println("M - Masculino"); break;
			default: System.out.println("Sexo inválido!");
		}
		
	}

}