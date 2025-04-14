package com.loiane.cursojava.aula43.exercicios;

public class ContaPoupanca extends ContaBancaria{

	private double taxaRendimento;
	
	public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
		super.inicializarContaBancaria(nomeCliente, numConta, saldo);
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
		setTaxaRendimento(taxaRendimento);
		if(this.taxaRendimento < 0) {
			System.out.println(super.getNomeCliente() + ", não foi possível calcular um novo saldo!");
		} else {
			double novoSaldo = super.getSaldo();
			novoSaldo += (novoSaldo*this.taxaRendimento);
			super.setSaldo(novoSaldo);
			System.out.println("Saldo da conta " + this.getNumConta() + " atualizado! " + super.infoSaldo());
		}
	}

	@Override
	public String toString() {
		return "ContaPoupanca " + super.toString() + "taxaRendimento=" + taxaRendimento + "]";
	}
	
}
