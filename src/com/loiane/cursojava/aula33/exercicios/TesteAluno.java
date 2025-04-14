package com.loiane.cursojava.aula33.exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.setNome(scan.nextLine());
		
		System.out.print("Matricula: ");
		aluno.setMatricula(scan.nextLine());
		
		System.out.print("Curso: ");
		aluno.setCurso(scan.nextLine());
		
		for(int i=0; i<aluno.getDisciplinas().length; i++) {
			System.out.println("Disciplina " + (i+1) + ": ");
			aluno.setDisciplinas(scan.next(), i);
			
			for(int j=0; j<aluno.tamanhoNotas(i); j++) {
				System.out.print("Nota " + (j+1) + ": ");
				aluno.setNotas(scan.nextDouble(), i, j);
			}
		}
		
		aluno.mostrarBoletim();
	
	}
}
