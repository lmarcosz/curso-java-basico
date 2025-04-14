package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double num1 = input.nextDouble();

		System.out.print("Segundo número: ");
		double num2 = input.nextDouble();
		
		if(num1>num2) {
			System.out.println("Maior: " + num1);
		} else {
			System.out.println("Maior: " + num2);
		}
		
	}

}