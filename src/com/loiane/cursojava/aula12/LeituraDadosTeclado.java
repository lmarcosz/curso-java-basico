package com.loiane.cursojava.aula12;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seja bem-vindo(a) " + nomeCompleto + "!");
		
		System.out.print("Seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é " + primeiroNome);

		
		System.out.println("Sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é " + idade);
			
		
		System.out.println("Sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é " + altura);
		*/
		
		System.out.println("Digite as seguintes infos: Nome, Idade, Qtd Filhos, Altura, Se tem PET");
		
		String nome = scan.next();
		short idade = scan.nextShort();
		byte quantidadeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Informações dadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de Filhos: " + quantidadeFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem PET?: " + temPet);
		
	}

}
