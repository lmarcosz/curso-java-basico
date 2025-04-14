package com.loiane.cursojava.aula36.exercicios;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double obterMedia() {
		double soma = 0;
		for(double n: notas) {
			soma += n;
		}
		return soma/4;
	}
	
	public String obterInfo() {
		String info = this.nome + " - " + this.matricula;
		if(notas != null) {
			info += "\nNotas: ";
			
			for(double n: notas) {
				info += n + " ";
			}
			
			info += "\nMedia Final: " + obterMedia() + " - ";
			
			if(obterMedia() >=7) {
				info += "APROVADO \n";
			} else {
				info += "REPROVADO \n";
			}
		}
		return info;
	}
	
}
