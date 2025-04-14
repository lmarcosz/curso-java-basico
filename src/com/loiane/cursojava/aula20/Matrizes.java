package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 5;
		notasAlunos[1][2] = 5;
		notasAlunos[1][3] = 5;
		
		notasAlunos[2][0] = 4;
		notasAlunos[2][1] = 10;
		notasAlunos[2][2] = 6;
		notasAlunos[2][3] = 9;
		
		for(int i=0; i<notasAlunos.length; i++) {
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média");
		
		double[] media = new double[3];
		
		for(int i=0; i<notasAlunos.length; i++) {
			for(int j=0; j<notasAlunos[i].length; j++) {
				media[i] += notasAlunos[i][j];
			}
			media[i] = media[i]/4;
			System.out.println("Média do aluno " + (i+1) + " = " + media[i]);
		}
		
	}

}
