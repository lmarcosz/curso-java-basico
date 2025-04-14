package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperatura Cº: ");
		float tempCel = scan.nextFloat();
		
		float tempFar = tempCel * 1.8f + 32;
		System.out.println("Temperatura Fº: " + tempFar);

	}
}