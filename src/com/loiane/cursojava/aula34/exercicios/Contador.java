package com.loiane.cursojava.aula34.exercicios;

public class Contador {

	private static int num;

	public Contador() {
		num++;
	}
	
	public static void zerarNum() {
		num = 0;
	}
	
	public static void incrementarNum() {
		num++;
	}
	
	public static int obterNum() {
		return num;
	}
	
}
