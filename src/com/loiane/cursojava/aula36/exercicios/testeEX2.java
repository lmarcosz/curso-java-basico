package com.loiane.cursojava.aula36.exercicios;

import java.util.Scanner;

public class testeEX2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome do curso: ");
		String nomeCurso = scan.nextLine();
		
		System.out.print("Horário do curso: ");
		String horarioCurso = scan.nextLine();
	
		System.out.print("Nome do Professor: ");
		String nomeProf = scan.nextLine();
		
		System.out.print("Departamento do Professor: ");
		String departamentoProf = scan.nextLine();
		
		System.out.print("Email do Professor: ");
		String emailProf = scan.nextLine();
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(departamentoProf);
		professor.setEmail(emailProf);
		
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		curso.setHorario(horarioCurso);
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("\nAluno " + (i+1));
			
			System.out.print("Nome: ");
			String nomeAluno = scan.next();
			
			System.out.print("Matricula: ");
			String matriculaAluno = scan.next();
			
			double[] notas = new double[4];
			
			for(int j=0; j<4; j++) {
				System.out.print("Nota " + (j+1) + ": ");
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		curso.obterInfo();
		
	}
	
}
