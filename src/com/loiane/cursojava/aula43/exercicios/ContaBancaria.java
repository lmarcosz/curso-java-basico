package com.loiane.cursojava.aula43.exercicios;

public abstract class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valorSaque) {
		double saldo = this.getSaldo();
		if((saldo-valorSaque)<0 || valorSaque<=0) {
			System.out.println(getNomeCliente() + ", não foi possível sacar!");
		} else {
			saldo -= valorSaque;
			this.setSaldo(saldo);
			System.out.println("Saque realizado! " + this.infoSaldo());
		}
	}
	
	protected void inicializarContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.setNomeCliente(nomeCliente);
		this.setNumConta(numConta);
		this.setSaldo(saldo);
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito <=0) {
			System.out.println(getNomeCliente() + ", não foi possível depositar!");
		} else {
			double saldo = this.getSaldo() + valorDeposito;
			this.setSaldo(saldo);
			System.out.println("Depósito para a conta "+ this.getNumConta() +" realizado! " + this.infoSaldo());
		}
	}
	
	protected String infoSaldo() {
		return "[Conta " + this.getNumConta() + "] Saldo: R$" + String.format("%.2f", this.getSaldo());
	}
	
	@Override
	public String toString() {
		return "[nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + ", ";
	}
	
}
