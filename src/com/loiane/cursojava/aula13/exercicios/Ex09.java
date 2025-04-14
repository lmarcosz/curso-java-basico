package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperatura Fº: ");
		float tempFar = scan.nextFloat();
		
		float tempCel = (5*(tempFar - 32)/9);
		System.out.println("Temperatura Cº: " + tempCel);

	}

}