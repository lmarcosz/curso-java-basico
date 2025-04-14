package com.loiane.cursojava.aula43.exercicios;

public class PessoaJuridica extends Contribuinte {

	public PessoaJuridica(String nome, double rendaBruta) {
		super.setNome(nome);
		super.setTipoPJ(true);
		super.setRendaBruta(rendaBruta);
		this.calcularImposto();
	}
	
	public void calcularImposto() {
		double imposto = super.getRendaBruta() * 0.1;
		super.setImpostoAPagar(imposto);
	}
	
}
