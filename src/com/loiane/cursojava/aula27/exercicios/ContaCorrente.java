package com.loiane.cursojava.aula27.exercicios;

public class ContaCorrente {

	String numeroConta;
	double saldo;
	double limite;
	boolean especial;
	
	
	double sacarDinheiro(double valorSaque) {
		double valorFinal = saldo - valorSaque;
		
		if(especial) {
			if(valorFinal < ((-1)*limite)) {
				System.out.println("Não foi possível sacar! (Limite Insuficiente)");
				return 0;
			}
			else {
				saldo = valorFinal;
				System.out.print("Saque Realizado! ");
				consultarSaldo();
				return valorSaque;
			}
		}
		else {
			if(valorFinal < 0) {
				System.out.println("Não foi possível sacar! (Saldo Insuficiente)");
				return 0;
			}
			else {
				saldo = valorFinal;
				System.out.print("Saque Realizado! ");
				consultarSaldo();
				return valorSaque;
			}
		}
		
	}
	
	void depositarDinheiro(double valorDeposito) {
		saldo += valorDeposito;
		System.out.print("Depósito Realizado! ");
		consultarSaldo();
	}
	
	void consultarSaldo() {
		System.out.println("(Saldo: R$ " + saldo + ")");
	}
	
	void verificaChequeEspecial() {
		if(especial && saldo < 0) {
			System.out.println("O cliente está utilizando o Cheque Especial!");
		}
		else if(especial != true) {
			System.out.println("O cliente não tem Cheque Especial!");
		}
		else {
			System.out.println("O cliente não está utilizando o Cheque Especial!");
		}
	}
	
}
