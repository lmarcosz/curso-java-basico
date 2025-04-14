package com.loiane.cursojava.aula27.exercicios;

import java.util.Scanner;

public class JogoDaVelha {
	
	String[] tabela = new String[9];
	int numJogadas = 0;
	
	boolean marcarTabela(String op) {
		if(op=="1"||op=="2"||op=="3"||op=="4"||op=="5"||op=="6"||op=="7"||op=="8"||op=="9") {
			System.out.println("A opção selecionada não existe! Tente novamente.");
			return false;
		}
		
		int numOp = Integer.parseInt(op);
		if(tabela[numOp-1]!=op) {
			System.out.println("Posição já ocupada! Tente novamente.");
			return false;
		}
		System.out.println("Deu certo!");
		return true;
	}
	
	boolean alternarJogador() {
		numJogadas++;
		if(numJogadas%2 == 0) {
			return true;
		}
		return false;
	}
	
	void inicializarJogo() {
		for(int i=0; i<tabela.length; i++) {
			tabela[i] = String.valueOf(i+1);
		}
		numJogadas = 0;
	}
	
	void desenharTabela() {
		System.out.println("Vez do jogador ...");
		System.out.println(tabela[0] + "|" + tabela[1] + "|" + tabela[2]);
		System.out.println(tabela[3] + "|" + tabela[4] + "|" + tabela[5]);
		System.out.println(tabela[6] + "|" + tabela[7] + "|" + tabela[8]);
	}
	
	
}
