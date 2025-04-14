package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Metros: ");
		double medicao = scan.nextDouble();
		
		System.out.println("Em centímetros: " + medicao*100);
	}

}
