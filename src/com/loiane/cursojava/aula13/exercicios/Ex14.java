package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Peso dos peixes (em Kg): ");
		float peso = scan.nextFloat();
		final float pesoMaximo = 50;
		float excedente = 0;
		
		if(peso > pesoMaximo) {
			excedente = peso-pesoMaximo;
		}
		
		float multa = 4.00f*excedente;
		
		System.out.printf("Multa: R$ %.2f\n", multa);
		System.out.printf("Peso excedente: %.3fKg\n", excedente);
	}

}
