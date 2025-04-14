package com.loiane.cursojava.aula19.exercicios;

public class Ex02 {

	public static void main(String[] args) {
	
		int[] A = new int[8];
		int[] B = new int[8];
		
		A[0] = 9;
		A[1] = 46;
		A[2] = 13;
		A[3] = 8;
		A[4] = 43;
		A[5] = 4;
		A[6] = 90;
		A[7] = 5;
		
		for(int i=0; i<A.length; i++) {
			B[i] = A[i]*2;
		}
		
		System.out.println("Valores de B: ");
		for(int i=0; i<A.length; i++) {
			System.out.println(B[i]);
		}
		
	}

}
