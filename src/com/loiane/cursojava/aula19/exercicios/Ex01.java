package com.loiane.cursojava.aula19.exercicios;

public class Ex01 {

	public static void main(String[] args) {
	
		int[] A = new int[5];
		int[] B = new int[5];
		
		A[0] = 9;
		A[1] = 46;
		A[2] = 13;
		A[3] = 8;
		A[4] = 43;
		
		for(int i=0; i<5; i++) {
			B[i] = A[i];
		}
		
		System.out.println("Valores de B: ");
		for(int i=0; i<5; i++) {
			System.out.println(B[i]);
		}
		
	}

}
