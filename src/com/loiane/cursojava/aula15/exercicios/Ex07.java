package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double num1 = input.nextDouble();

		System.out.print("Segundo número: ");
		double num2 = input.nextDouble();
		
		System.out.print("Terceiro número: ");
		double num3 = input.nextDouble();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("Maior: " + num1);
		} 
		else if(num2>=num1 && num2>=num3){
			System.out.println("Maior: " + num2);
		}
		else if(num3>=num1 && num3>=num2){
			System.out.println("Maior: " + num3);
		}
		
		if(num1<=num2 && num1<=num3) {
			System.out.println("Menor: " + num1);
		} 
		else if(num2<=num1 && num2<=num3){
			System.out.println("Menor: " + num2);
		}
		else if(num3<=num1 && num3<=num2){
			System.out.println("Menor: " + num3);
		}
		
	}

}