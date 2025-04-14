package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nº inteiro 1: ");
		long numInt1 = scan.nextLong();

		System.out.print("Nº inteiro 2: ");
		long numInt2 = scan.nextLong();
		
		System.out.print("Nº real: ");
		long numReal = scan.nextLong();
		
		System.out.println("a = " + ((numInt1*2)*(numInt2/2)));
		System.out.println("b = " + (3*numInt1+numReal));
		System.out.println("c = " + (Math.pow(numReal,3)));
	}

}
