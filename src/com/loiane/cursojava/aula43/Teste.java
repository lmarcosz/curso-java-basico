package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		
		double[] notas = {9.5, 3, 6, 10};

		aluno.setCurso("Engenharia da Computação");
		aluno.setNotas(notas);
		
		aluno2.setCurso("Engenharia da Computação");
		aluno2.setNotas(notas);
		
		System.out.println(aluno.equals(aluno2));
		
	}

}
