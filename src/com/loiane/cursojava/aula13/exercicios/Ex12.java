package com.loiane.cursojava.aula13.exercicios;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Altura: ");
		float altura = scan.nextFloat();
		float pesoIdeal = (72.7f*altura)-58;
		
		System.out.printf("Peso ideal: %.2f Kg", pesoIdeal);
	}
}
