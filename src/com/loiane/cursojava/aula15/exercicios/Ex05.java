package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nota 1 (de 0 à 10): ");
		float nota1 = input.nextFloat();
		
		if(nota1>=0 && nota1<=10) {
			System.out.print("Nota 2 (de 0 à 10): ");
			float nota2 = input.nextFloat();
			
			if(nota2>=0 && nota2<=10) {
				float media = (nota1+nota2)/2;
				
				if(media==10) {
					System.out.println("Aprovado com Distinção");				
				}
				else if(media>=7) {
					System.out.println("Aprovado");				
				}
				else {
					System.out.println("Reprovado");				
				}
			}
			else {
				System.out.println("Nota inválida!");
			}
		}
		else {
			System.out.println("Nota inválida!");
		}
		
	}

}
