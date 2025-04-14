package com.loiane.cursojava.aula39.teste;

import com.loiane.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;
	
	public void verificarVisibilidade() {
		this.nomeVisibilidade = "sdsdsad";
		super.nomeVisibilidade = "dsdsdada";
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

