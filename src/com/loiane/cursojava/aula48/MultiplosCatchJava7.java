package com.loiane.cursojava.aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {
		int[] num = {2, 4, 8, 16, 32, 64, 128};
		int[] den = {2, 0, 8, 0, 32, 64};
		
		for(int i=0; i<num.length; i++) {
			try {
				System.out.println(num[i] + "/" + den[i] + "=" + (num[i]/den[i]));
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.err.println("Ocorreu um erro!");
			}
		}
	}
}
