package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Preço do Produto 1: R$");
		double preco1 = input.nextDouble();

		System.out.print("Preço do Produto 2: R$");
		double preco2 = input.nextDouble();
		
		System.out.print("Preço do Produto 3: R$");
		double preco3 = input.nextDouble();
		
		if(preco1<=preco2 && preco1<=preco3) {
			if(preco1==preco2 && preco1!=preco3) {
				System.out.println("Os produtos 1 e 2 são os mais baratos!");	
			}
			else if(preco1==preco3 && preco1!=preco2) {
				System.out.println("Os produtos 1 e 3 são os mais baratos!");	
			}
			else if(preco1==preco2 && preco1==preco3) {
				System.out.println("Todos os produtos possuem o mesmo preço!");	
			}
			else {
				System.out.println("O produto 1 é o mais barato!");	
			}
		} 
		else if(preco2<=preco1 && preco2<=preco3){
			if(preco2==preco1 && preco2!=preco3) {
				System.out.println("Os produtos 1 e 2 são os mais baratos!");	
			}
			else if(preco2==preco3 && preco2!=preco1) {
				System.out.println("Os produtos 2 e 3 são os mais baratos!");	
			}
			else if(preco2==preco1 && preco2==preco3) {
				System.out.println("Todos os produtos possuem o mesmo preço!");	
			}
			else {
				System.out.println("O produto 2 é o mais barato!");	
			}		
		}
		else if(preco3<=preco1 && preco3<=preco2){
			if(preco3==preco1 && preco3!=preco2) {
				System.out.println("Os produtos 1 e 3 são os mais baratos!");	
			}
			else if(preco3==preco2 && preco3!=preco1) {
				System.out.println("Os produtos 2 e 3 são os mais baratos!");	
			}
			else if(preco3==preco1 && preco3==preco1) {
				System.out.println("Todos os produtos possuem o mesmo preço!");	
			}
			else {
				System.out.println("O produto 3 é o mais barato!");	
			}
		}
		
	}

}