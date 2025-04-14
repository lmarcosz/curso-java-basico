package com.loiane.cursojava.aula27.exercicios;

public class Lampada {

	String marca;
	String modelo;
	String tipoLuz;
	String cor;
	double potencia;
	double brilho;
	String tensao;
	boolean acesa = false;
	
	void ligar() {
		acesa = true;
	}
	
	void desligar() {
		acesa = false;
	}
	
	void mostrarEstado() {
		String mensagem = acesa ? "Lampada ligada" : "Lampada desligada";
		System.out.println(mensagem);
	}
	
	void trocarEstado() {
		acesa = acesa ? false : true;
	}
	
}
