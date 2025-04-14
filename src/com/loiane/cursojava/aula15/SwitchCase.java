package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número correspondente ao dia da semana (1-7): ");
		byte dayWeek = input.nextByte();
		
		switch(dayWeek) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: System.out.println("Dia Útil!"); break;
			case 1: 
			case 7: System.out.println("Final de Semana!"); break;
			default: System.out.print("Não é um dia válido!");
		}
		
	}

}
