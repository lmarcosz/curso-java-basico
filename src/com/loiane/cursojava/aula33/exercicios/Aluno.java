package com.loiane.cursojava.aula33.exercicios;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;
	
	Aluno() {
		disciplinas = new String[3];
		notas = new double[3][3];
	}

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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplina, int i) {
		this.disciplinas[i] = disciplina;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double nota, int i, int j) {
		this.notas[i][j] = nota;
	}
	
	public int tamanhoNotas(int i) {
		return this.notas[i].length;
	}
	
	public double calcularMedia(double n1, double n2, double n3) {
		return (n1+n2+n3)/3;
	}
	
	public void mostrarBoletim() {
		String resultado;
		double media;
		System.out.println();
		System.out.println("=======BOLETIM FINAL=======");
		System.out.println("Nome: " + this.nome + " (" + this.matricula + ")");
		System.out.println("Curso: " + this.curso);
		System.out.println();
		
		for(int i=0; i<disciplinas.length; i++) {
			System.out.println("Disciplina: " + disciplinas[i]);
			media = calcularMedia(notas[i][0], notas[i][1], notas[i][2]);
			resultado = (media>=7) ? "APROVADO" : "REPROVADO"; 
			System.out.println("Média final: " + String.format("%.2f", media) + " (" + resultado + ")");
			System.out.println();
		}
		
	}
	
	
}
