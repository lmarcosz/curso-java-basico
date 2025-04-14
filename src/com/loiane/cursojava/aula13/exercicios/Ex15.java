package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês?");
		int horasMes = scan.nextInt();
		
		double salarioBruto = horasMes*salarioHora;
		double impostoRenda = salarioBruto*0.11f;
		double impostoINSS = salarioBruto*0.08f;
		double impostoSindical = salarioBruto*0.05f;
		double descontoTotal = impostoRenda + impostoINSS + impostoSindical;
		double salarioLiquido = salarioBruto - descontoTotal;
		
		
		System.out.printf("Salario Bruto = R$%.2f\n", salarioBruto);
		System.out.printf("Imposto INSS = R$%.2f\n", impostoINSS);
		System.out.printf("Imposto Sindical = R$%.2f\n", impostoSindical);
		System.out.printf("Salario Líquido = R$%.2f\n", salarioLiquido);

	}

}
