package com.loiane.cursojava.aula20;

public class MatrizTresDimensoes {

	public static void main(String[] args) {
		int[][][] mat = new int[3][3][3];
		int somaTotal = 0;
		int somaPar = 0;
		int somaImpar = 0;
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				for(int k=0; k<mat[i][j].length; k++) {
					mat[i][j][k] = i+j+k;
					somaTotal += mat[i][j][k];
					if((mat[i][j][k])%2==0) {
						somaPar += mat[i][j][k];
					} else {
						somaImpar += mat[i][j][k];
					}
				}
			}
		}
		
		System.out.println("Soma Total = " + somaTotal);
		System.out.println("Soma Par = " + somaPar);
		System.out.println("Soma Ímpar = " + soma);
	}

}
