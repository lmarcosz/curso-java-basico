package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Salário do colaborador: R$");
		float salarioAntigo = input.nextFloat();
		float salarioNovo = salarioAntigo;
		
		if(salarioAntigo<=280) {
			salarioNovo *= 1.2f;
		}
		else if(salarioAntigo<=700) {
			salarioNovo *= 1.15f;
		}
		else if(salarioAntigo<=1500) {
			salarioNovo *= 1.1f;
		}
		else {
			salarioNovo *= 1.05f;
		}
		
		System.out.printf("Salário Antigo: R$%.2f\n", salarioAntigo);
		System.out.printf("Percentual de Aumento: %.0f%%\n", ((salarioNovo-salarioAntigo)/salarioAntigo)*100);
		System.out.printf("Aumento: R$%.2f\n", salarioNovo-salarioAntigo);
		System.out.printf("Salário Novo: R$%.2f\n", salarioNovo);
			
	}

}
