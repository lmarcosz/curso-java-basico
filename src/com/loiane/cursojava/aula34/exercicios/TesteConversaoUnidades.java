package com.loiane.cursojava.aula34.exercicios;

public class TesteConversaoUnidades {
	
	public static void main(String[] args) {
		
		
		double n1 = ConversaoDeUnidadesDeArea.acreParaPesQuadrados(5);
		double n2 = ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(6);
		double n3 = ConversaoDeUnidadesDeArea.milhaQuadradaParaAcre(10);
		double n4 = ConversaoDeUnidadesDeArea.peQuadradoParaCentQuadrado(0.3);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
	}
	
}
