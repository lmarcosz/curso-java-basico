package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int a = scan.nextInt();
		System.out.print("Numero 2: ");
		int b = scan.nextInt();
		
		System.out.println("Soma = " + (a+b));
	}

}
