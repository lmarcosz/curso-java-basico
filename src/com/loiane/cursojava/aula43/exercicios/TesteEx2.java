package com.loiane.cursojava.aula43.exercicios;

public class TesteEx2 {

	public static void main(String[] args) {
		
		Contribuinte p1 = new PessoaJuridica("ST Solução", 51000.90);
		Contribuinte p2 = new PessoaJuridica("Marco Acessorios", 13300.49);
		Contribuinte p3 = new PessoaJuridica("Daniel Alves Advocacia", 150030.73);
		Contribuinte p4 = new PessoaFisica("José da Silva", 2500);
		Contribuinte p5 = new PessoaFisica("Maria do Carmo", 1400.01);
		Contribuinte p6 = new PessoaFisica("Liliana Sousa", 8000.43);
		
		p1.imprimirInfo();
		p2.imprimirInfo();
		p3.imprimirInfo();
		p4.imprimirInfo();
		p5.imprimirInfo();
		p6.imprimirInfo();

	}

}
