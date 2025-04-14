package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double num1 = input.nextDouble();

		System.out.print("Segundo número: ");
		double num2 = input.nextDouble();
		
		System.out.print("Terceiro número: ");
		double num3 = input.nextDouble();
		
		double maior = 0;
		double media = 0;
		double menor = 0;
		
		if(num1>=num2 && num1>=num3) {
			maior = num1;
		} 
		else if(num2>=num1 && num2>=num3){
			maior = num2;		
		}
		else if(num3>=num1 && num3>=num2){
			maior = num3;		
		}
		
		if(num1<=num2 && num1<=num3) {
			menor = num1;
		} 
		else if(num2<=num1 && num2<=num3){
			menor = num2;
		}
		else if(num3<=num1 && num3<=num2){
			menor = num3;
		}
		
		if(num1>menor && num1<maior) {
			media = num1;
		}
		else if(num2>menor && num2<maior) {
			media = num2;
		}
		else if(num3>menor && num3<maior) {
			media = num3;
		}
		else if(num1==num2 || num1==num3) {
			media = num1;
		}
		else if(num2==num1 || num2==num3) {
			media = num2;
		}
		else if(num3==num1 || num3==num2) {
			media = num3;
		}
		
		System.out.println(maior + " " + media + " " + menor);
		
	}

}