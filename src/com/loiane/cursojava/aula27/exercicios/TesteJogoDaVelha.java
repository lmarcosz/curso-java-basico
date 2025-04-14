package com.loiane.cursojava.aula27.exercicios;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogo = new JogoDaVelha();
		
		jogo.inicializarJogo();
		jogo.desenharTabela();
		
		String op = scan.nextLine();
		System.out.println(jogo.marcarTabela(op));
		
		
	}

}
