package com.loiane.cursojava.aula43.exercicios;

public class PessoaFisica extends Contribuinte {
	
	public PessoaFisica(String nome, double rendaBruta) {
		super.setNome(nome);
		super.setTipoPJ(false);
		super.setRendaBruta(rendaBruta);
		this.calcularImposto();
	}
	
	public void calcularImposto() {
		double rendaBruta = super.getRendaBruta();
		double imposto;
		
		if(rendaBruta>=0 && rendaBruta<=1400) {
			imposto = 0;
		} else if(rendaBruta<=2100) {
			imposto = (rendaBruta*0.1)-100;
		} else if(rendaBruta<=2800) {
			imposto = (rendaBruta*0.15)-270;
		} else if(rendaBruta<=3600) {
			imposto = (rendaBruta*0.25)-500;
		} else {
			imposto = (rendaBruta*0.3)-700;
		}
		
		super.setImpostoAPagar(imposto);
	}
	
}
