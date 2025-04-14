package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Valor da hora trabalhada: R$");
		float valorHora = input.nextFloat();
		
		System.out.print("Horas trabalhadas ao mês: ");
		short horasMes = input.nextShort();
		
		float salarioBruto = valorHora*horasMes;
		
		float descontoINSS = salarioBruto*0.1f;
		float valorFGTS = salarioBruto*0.11f;
		float descontoSindicato = salarioBruto*0.03f;
		float descontoIR = salarioBruto;
		
		if(salarioBruto<=800) {
			descontoIR = 0;
		}
		else if(salarioBruto<=1500) {
			descontoIR *= 0.05f;
		}
		else if(salarioBruto<=2500) {
			descontoIR *= 0.1f;
		}
		else {
			descontoIR *= 0.2f;
		}
		
		float totalDescontos = descontoINSS+descontoSindicato+descontoIR;
		float salarioLiquido = salarioBruto-totalDescontos;
		
		System.out.printf("Salário Bruto: R$%.2f\n", salarioBruto);
		System.out.printf("(-) Imposto Sindical (3%%): R$%.2f\n", descontoSindicato);
		System.out.printf("(-) IR (5%%): R$%.2f\n", descontoIR);
		System.out.printf("(-) INSS (10%%): R$%.2f\n", descontoINSS);		
		System.out.printf("FGTS (11%%): R$%.2f\n", valorFGTS);
		System.out.printf("Total de Descontos: R$%.2f\n", totalDescontos);
		System.out.printf("Salário Líquido: R$%.2f\n", salarioLiquido);
	
	}

}
