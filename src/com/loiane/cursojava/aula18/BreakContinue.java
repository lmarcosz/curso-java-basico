package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número mínimo: ");
		int min = input.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = input.nextInt();

		//Encontrando o primeiro número que é divisível por 7
		for(int i=min; i<=max; i++) {
			if(i%7==0) {
				System.out.println("O primeiro número divisível por 7 é o " + i);
				break;
			}
		}
		
		//Pula a impressão dos números divisíveis por 7
		for(int i=min; i<=max; i++) {
			if(i%7==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
