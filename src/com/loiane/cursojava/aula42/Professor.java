package com.loiane.cursojava.aula42;

public class Professor extends Pessoa {
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}
	
}
