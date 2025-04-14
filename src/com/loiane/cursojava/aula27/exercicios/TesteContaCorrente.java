package com.loiane.cursojava.aula27.exercicios;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numeroConta = "4562";
		conta.saldo = 345.04;
		conta.limite = 100;
		conta.especial = true;
		
		conta.consultarSaldo();	
		conta.verificaChequeEspecial();
		conta.depositarDinheiro(20);
		conta.sacarDinheiro(30);
		
	}

}
