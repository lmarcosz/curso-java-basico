package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas entrevistadas: ");
		int quantPessoas = scan.nextInt();
		
		int[] filhosPorPessoa = new int[quantPessoas];
		String[][] info = new String[quantPessoas][];
		
		for(int i=0; i<info.length; i++) {
			System.out.println((i+1) + ") Número de Filhos: ");
			int numFilhos = scan.nextInt();
			info[i] = new String[numFilhos];
			filhosPorPessoa[i] = numFilhos;
			for(int j=0; j<info[i].length; j++) {
				info[i][j] = scan.next();
			}
		}
		
		System.out.println("======Resultado da pesquisa======");
		for(int i=0; i<info.length; i++) {
			System.out.println("Entrevistado " + (i+1));
			System.out.println("Numero de Filhos " + filhosPorPessoa[i]);
			for(int j=0; j<info[i].length; j++) {
				System.out.println("-" + info[i][j] + " ");
			}
			System.out.println("--------------------");
		}
		
	}

}
