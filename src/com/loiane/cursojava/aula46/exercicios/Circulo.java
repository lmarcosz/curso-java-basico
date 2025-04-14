package com.loiane.cursojava.aula46.exercicios;

public class Circulo extends Figura2D implements DimensaoSuperficial {
	
	private double raio;
	
	Circulo(){}
	
	Circulo(double raio){
		this.setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void calcularArea() {
		super.setArea(Math.PI * Math.pow(raio, 2));
	}
	
}
