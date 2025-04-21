package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) throws Exception {
		System.out.print("Entre com um número decimal: ");
		double num = leNumero();
		System.out.print("Você digitou o número " + num);
		
	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		scan.close();
		return num;
	}
}
