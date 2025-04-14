package com.loiane.cursojava.aula43.exercicios;

public class ContaEspecial extends ContaBancaria{

	private double limite;
	
	public ContaEspecial() {};
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super.inicializarContaBancaria(nomeCliente, numConta, saldo);
		this.setLimite(limite);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valorSaque) {
		double saldo = super.getSaldo();
		if(saldo-valorSaque < this.limite*(-1) || valorSaque<=0) {
			System.out.println(getNomeCliente() + ", não foi possível sacar!");
		} else {
			saldo -= valorSaque;
			super.setSaldo(saldo);
			System.out.println("Saque realizado! " + super.infoSaldo());
		}
	}

	@Override
	public String toString() {
		return "ContaEspecial " + super.toString() + "limite=" + limite + "]";
	}
	
}
