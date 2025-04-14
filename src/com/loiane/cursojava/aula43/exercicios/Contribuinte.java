package com.loiane.cursojava.aula43.exercicios;

public abstract class Contribuinte {

	private String nome;
	private boolean tipoPJ;
	private double rendaBruta;
	private double impostoAPagar;
	
	public String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isTipoPJ() {
		return tipoPJ;
	}
	protected void setTipoPJ(boolean tipoPJ) {
		this.tipoPJ = tipoPJ;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	protected void setRendaBruta(double rendaBruta) {
		if(rendaBruta < 0) {
			System.out.println("Renda bruta inválida!");
		} else {
			this.rendaBruta = rendaBruta;
		}
	}
	public double getImpostoAPagar() {
		return impostoAPagar;
	}
	protected void setImpostoAPagar(double impostoAPagar) {
		this.impostoAPagar = impostoAPagar;
	}
	
	public abstract void calcularImposto();
	
	public void imprimirInfo() {
		String s = "Nome: " + this.getNome() + "\nTipo: ";
		
		if(isTipoPJ()) {
			s += "Pessoa Jurídica\n";
		} else {
			s += "Pessoa Física\n"; 
		}		
		s += "Renda Bruta: R$ " + String.format("%.2f", this.getRendaBruta()) + "\n";
		s += "Imposto a ser pago: R$ " + String.format("%.2f", this.getImpostoAPagar()) + "\n";

		System.out.println(s);
	}
	
}
