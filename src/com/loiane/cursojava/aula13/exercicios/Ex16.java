package com.loiane.cursojava.aula13.exercicios;
import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Área a ser pintada (em m²): ");
		double area = scan.nextDouble();
		
		if(area<=54) area=54;
		
		double totalLitrosTinta = area/3;
		int quantLatasTinta = (int)(totalLitrosTinta/18);
		final float precoLata = 80.00f;
		double precoTotal = quantLatasTinta*precoLata;
		
		System.out.println("Número de latas necessárias: " + quantLatasTinta);
		System.out.printf("Preço total: R$%.2f", precoTotal);
	}
	
}
