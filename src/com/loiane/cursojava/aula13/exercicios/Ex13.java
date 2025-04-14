package com.loiane.cursojava.aula13.exercicios;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Altura: ");
		float altura = scan.nextFloat();
		
		System.out.print("Sexo(M/F): ");
		char sexo = scan.next().charAt(0);
		
		
		if(sexo=='m' || sexo=='M' || sexo=='f' || sexo=='F') {
			float peso = scan.nextFloat();
			float pesoIdeal;
			
			if(sexo=='m' || sexo=='M') {
				pesoIdeal = (72.7f*altura)-58;
			} else {
				pesoIdeal = (62.1f*altura)-44.7f;
			}
			
			if(peso==pesoIdeal) {
				System.out.println("Peso ideal!");
			} else if(peso>pesoIdeal) {
				System.out.println("Acima do peso ideal!");
			} else {
				System.out.println("Abaixo do peso ideal!");
			}
		}
		else {
			System.out.println("Sexo inválido!");
		}
			
	}
}
