package com.loiane.cursojava.aula27.exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.mostrarEstado();
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.trocarEstado();
		lampada.mostrarEstado();
		lampada.trocarEstado();
		lampada.mostrarEstado();
		
	}

}
