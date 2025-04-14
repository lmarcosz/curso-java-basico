package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número do dia da semana (1-7): ");
		byte num = input.nextByte();
		
		switch(num) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Valor inválido!");
		}
		
	}

}
