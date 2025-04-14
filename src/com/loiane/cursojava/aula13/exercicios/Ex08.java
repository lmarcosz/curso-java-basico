package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês?");
		int horasMes = scan.nextInt();
		
		System.out.println("Você ganha R$" + (horasMes*salarioHora) + " por mês!");

	}

}
