package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = (input.next().charAt(0));
		int codeASCII = letra;
				
		if(codeASCII>=65 && codeASCII<=90) {
			switch(codeASCII) {
				case 65:
				case 69:
				case 73:
				case 79:
				case 85: System.out.println("É vogal!"); break;
				default: System.out.println("É consoante");
			}
		}
		else if(codeASCII>=97 && codeASCII<=122) {
			switch(codeASCII) {
				case 97:
				case 101:
				case 105:
				case 111:
				case 117: System.out.println("É vogal!"); break;
				default: System.out.println("É consoante");
			}
		}
		else {
			System.out.println("Não é vogal e nem consoante!");
		}
		
	}

}
