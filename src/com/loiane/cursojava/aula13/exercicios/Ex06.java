package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Raio: ");
		float raio = scan.nextFloat();
		final float PI = 3.1415f;
		
		System.out.println("Área do círculo: " + PI*raio*raio);
		
	}

}
