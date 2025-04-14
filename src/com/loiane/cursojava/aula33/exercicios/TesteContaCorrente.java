package com.loiane.cursojava.aula33.exercicios;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente minhaConta = new ContaCorrente("4334", "324525", true, 100);
		
		minhaConta.consultarSaldo();
		minhaConta.sacarDinheiro(4);
		minhaConta.verificarChequeEspecial();
		
		minhaConta.depositarDinheiro(400);
		minhaConta.sacarDinheiro(300);
		minhaConta.sacarDinheiro(196);
	}

}
