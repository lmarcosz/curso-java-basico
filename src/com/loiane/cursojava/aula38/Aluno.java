package com.loiane.cursojava.aula38;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super("Marcos Lucas", "12121");
	}
	
	public void mostrarTeste() {
		System.out.println("Método de Aluno");
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
}
