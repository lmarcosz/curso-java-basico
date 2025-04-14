package com.loiane.cursojava.aula34.exercicios;

public class Calculadora {
	
	public static double somar(double x, double y) {
		return x+y;
	}
	
	public static double subtrair(double x, double y) {
		return x-y;
	}
	
	public static double multiplicar(double x, double y) {
		return x*y;
	}
	
	public static double dividir(double x, double y) {
		return x/y;
	}
	
	public static double potencia(double x, double y) {
		return Math.pow(x, y);
	}
	
	public static int fatorial(int x) {
		int fat = 1;
		for(int i=x; i>0; i--) {
			fat *= i;
		}
		return fat;
	}
	
}
