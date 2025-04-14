package com.loiane.cursojava.aula43.exercicios;

public class TesteEx3 {

	public static void main(String[] args) {
		
		Animal camelo = new Mamifero("Camelo", 150, 4, "Amarelo", 2);
		Animal tubarao = new Peixe("Tubarão", 300, 1.5);
		Animal ursoDoCanada = new Mamifero("Urso-do-canadá", 180, "Vermelho", 0.5, "Mel");
		
		camelo.imprimirInfo();
		tubarao.imprimirInfo();
		ursoDoCanada.imprimirInfo();
		
	}

}
