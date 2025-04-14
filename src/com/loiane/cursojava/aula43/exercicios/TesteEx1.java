package com.loiane.cursojava.aula43.exercicios;

public class TesteEx1 {

	public static void main(String[] args) {
		
		ContaEspecial especial = new ContaEspecial("Maria Dolores", "011", 150, 100);
		ContaPoupanca poupanca = new ContaPoupanca("José Silva", "022", 600);
		
		especial.sacar(100);
		poupanca.sacar(90);
		
		especial.depositar(500);
		poupanca.depositar(10);		
		
		poupanca.calcularNovoSaldo(0.06);
		
		System.out.println(especial);
		System.out.println(poupanca);
	}

}
