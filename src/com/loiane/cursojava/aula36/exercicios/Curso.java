package com.loiane.cursojava.aula36.exercicios;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public void obterInfo() {
		System.out.println("\n==========INFORMAÇÕES==========");
		System.out.println("Curso: " + this.nome);
		System.out.println("Horário: " + this.horario);
		if(professor != null) {
			System.out.println(professor.obterInfo());
		}
		if(alunos != null) {
			System.out.println("-----ALUNOS-----");
			for(Aluno a: alunos) {
				System.out.println(a.obterInfo());
			}
		}
	}
	
}
