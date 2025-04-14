package com.loiane.cursojava.aula33.exercicios;

public class ContaCorrente {

	private String agencia;
	private String conta;
	private double saldo;
	private double limiteCheque;
	private boolean especial;
	
	ContaCorrente(){
		this.saldo = 0.0;
		this.limiteCheque = 0.0;
		this.especial = false;
	}
	
	ContaCorrente(String agencia, String conta){
		this.agencia = agencia;
		this.conta = conta;
	}
	
	ContaCorrente(String agencia, String conta, boolean especial, double limiteCheque){
		this.agencia = agencia;
		this.conta = conta;
		this.especial = especial;
		this.limiteCheque = limiteCheque;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	private double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteCheque() {
		return limiteCheque;
	}
	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: R$" + this.getSaldo());
	}
		
	public void depositarDinheiro(double montante) {
		if(montante > 0) {
			this.saldo += montante;
			System.out.print("Depósito Realizado! ");
			this.consultarSaldo();
		} else {
			System.out.println("Insira um valor válido para depositar!");
		}
	}
	
	public boolean verificarChequeEspecial() {
		if(this.isEspecial()) {
			if(this.saldo < 0 && this.saldo >= this.limiteCheque*(-1)) {
				System.out.println("O cliente está usando o cheque especial!");
				return true;
			} 
			System.out.println("O cliente não está utilizando o cheque especial!");
			return false;
		}
		System.out.println("A conta não possui cheque especial!");
		return false;
	}
	
	public double sacarDinheiro(double montante) {
		double valorFinal = this.saldo - montante;
		
		if(this.isEspecial()) {
			if(valorFinal >= this.limiteCheque*(-1)) {
				this.saldo = valorFinal;
				System.out.print("Saque realizado! ");
				this.consultarSaldo();
				return montante;
			}
			System.out.println("Saldo infuficiente!");
			return 0;
		}
		
		if(valorFinal >= 0) {
			System.out.print("Saque realizado! ");
			this.consultarSaldo();
			return montante;
		}
		System.out.println("Saldo infuficiente!");
		return 0;
	}
	
}
