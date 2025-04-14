package com.loiane.cursojava.aula27.exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = scan.nextLine();
		
		System.out.print("Matricula: ");
		aluno.numMatricula = scan.nextLine();
		
		System.out.print("Curso: ");
		aluno.curso = scan.nextLine();
		
		aluno.disciplinas = new String[3];
		aluno.notas = new double[3];
		for(int i=0; i<aluno.disciplinas.length; i++) {
			System.out.print("Disciplina " + (i+1) + ": ");
			aluno.disciplinas[i] = scan.next();
			
			System.out.println("Nota: ");
			aluno.notas[i] = scan.nextDouble();
		}
		
		aluno.boletimFinal();
		
	}

}
