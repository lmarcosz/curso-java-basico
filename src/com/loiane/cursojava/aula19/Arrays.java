package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temp = new double[10];
		
		temp[0] = 82;
		temp[1] = 431;
		temp[2] = 9;
		temp[3] = 66;
		temp[4] = 15;
		temp[5] = 12;
		temp[6] = 22;
		
		//Usando for tradicional
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		//Usando for each
		for(double num: temp) {
			System.out.println(num);
		}
		
	}

}
