package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu turno (M,V,N): ");
		char turno = input.next().charAt(0);
		
		switch(turno) {
			case 'm':
			case 'M': System.out.println("Bom dia!"); break;
			case 'v':
			case 'V': System.out.println("Boa tarde!"); break;
			case 'n':
			case 'N': System.out.println("Boa noite!"); break;
			default: System.out.println("Valor inválido!");
		}
		
	}

}