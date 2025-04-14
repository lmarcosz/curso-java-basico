package com.loiane.cursojava.aula47;

public class Excecao {
	public static void main(String[] args) {
		try {
			int[] vet = new int[4];
			
			System.out.println("Antes da excecao");
			
			vet[5] = 10;
			
			System.out.println("Este texto nao será impresso");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.err.println("Exceção ao acessar uma posição que não existe!");
		}
		System.out.println("Este texto será impresso");
	}

}
