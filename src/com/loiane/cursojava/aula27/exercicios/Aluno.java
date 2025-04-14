package com.loiane.cursojava.aula27.exercicios;

public class Aluno {
	
	String nome;
	String numMatricula;
	String curso;
	String[] disciplinas;
	double[] notas;
	
	void boletimFinal() {
		String situacaoFinal;
		
		System.out.println();
		System.out.println("=======BOLETIM FINAL=======");
		System.out.println("Nome: " + nome + " (" + numMatricula + ")");
		System.out.println("Curso: " + curso);
		
		double mediaNotas = 0;
		for(int i=0; i<notas.length; i++) {
			mediaNotas += notas[i];
		}
		mediaNotas /= 3;
		
		if(mediaNotas>=7) {
			situacaoFinal = "APROVADO";
		}
		else {
			situacaoFinal = "REPROVADO";
		}
		
		System.out.println();
		System.out.printf("Média Final: %.2f", mediaNotas);
		System.out.println(" (" + situacaoFinal + ")");
	}
	
}
