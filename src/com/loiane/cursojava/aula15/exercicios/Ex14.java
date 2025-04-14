package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float nota1 = input.nextFloat();
		
		if(nota1<0 || nota1>10) {
			System.out.println("Nota inválida!");
		}
		else {
			System.out.print("Nota 2: ");
			float nota2 = input.nextFloat();
			
			if(nota2<0 || nota2>10) {
				System.out.println("Nota inválida!");
			}
			else {
				float media = (nota1+nota2)/2;
				char conceito;
				
				if(media>=9) {
					conceito = 'A';
				}
				else if(media >=7.5f) {
					conceito = 'B';
				}
				else if(media >=6) {
					conceito = 'C';
				}
				else if(media >=4) {
					conceito = 'D';
				}
				else {
					conceito = 'E';
				}
				
				String status;
				switch(conceito) {
					case 'A':
					case 'B':
					case 'C':
						status = "APROVADO"; 
						break;
					default:
						status = "REPROVADO"; 
				}
				
				System.out.println("====RESULTADO====");
				System.out.printf("Nota 1: %.1f\n", nota1);
				System.out.printf("Nota 2: %.1f\n", nota2);
				System.out.printf("Média: %.1f\n", media);
				System.out.printf("Conceito: %c\n%s\n", conceito, status);
				
			}
		}
	}

}
