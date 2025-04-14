package com.loiane.cursojava.aula13.exercicios;
import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Área a ser pintada (em m²): ");
		double area = scan.nextDouble();
	
		double totalLitrosTinta = area/6;
		double totalLitrosTintaLata = totalLitrosTinta;
		double totalLitrosTintaGalao = totalLitrosTinta;
		
		if(area<=108) totalLitrosTintaLata = 108/6;
		if(area<=21.6f) totalLitrosTintaGalao = 21.6f/6;
		
		double litrosLatasAux = totalLitrosTintaLata/18;
		int quantLatasTinta = (int)(litrosLatasAux);
		int quantGaloesTinta = (int)(totalLitrosTintaGalao/3.6f);
		
		final float precoLata = 80.00f;
		final float precoGalao = 25.00f;
		
		double precoTotalLatas = quantLatasTinta*precoLata;
		double precoTotalGaloes = quantGaloesTinta*precoGalao;
		
		System.out.println("Comprando apenas latas de 18L");
		System.out.println("Número de latas necessárias: " + quantLatasTinta);
		System.out.printf("Preço total: R$%.2f\n\n", precoTotalLatas);
		
		System.out.println("Comprando apenas galões de 3.6L");
		System.out.println("Número de galões necessários: " + quantGaloesTinta);
		System.out.printf("Preço total: R$%.2f\n\n", precoTotalGaloes);
			
		if(area<86.4f) {
			quantLatasTinta=0;
			precoTotalLatas=0;
		} 
		else if(area<=108){
			quantGaloesTinta=0;
			precoTotalGaloes=0;
		}
		else {
			double litrosSobrando = totalLitrosTinta - (quantLatasTinta*18);
			if(litrosSobrando%3.6f == 0) {
				quantGaloesTinta = (int)(litrosSobrando/3.6f);
			} else {
				quantGaloesTinta = (int)(litrosSobrando/3.6f)+1;	
			}
			precoTotalGaloes = quantGaloesTinta*precoGalao;
		}
		
		System.out.println("Melhor preço (considerando Latas e Galões)");
		System.out.println("Número de latas necessárias: " + quantLatasTinta);
		System.out.println("Número de galões necessários: " + quantGaloesTinta);
		System.out.printf("Preço total: R$%.2f\n", precoTotalLatas+precoTotalGaloes);	
		
	}
	
}
