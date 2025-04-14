package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lado do quadrado: ");
		float ladoQuadrado = scan.nextFloat();
		
		System.out.println("O dobro da área do Quadrado: " + (ladoQuadrado*ladoQuadrado)*2);

	}

}
