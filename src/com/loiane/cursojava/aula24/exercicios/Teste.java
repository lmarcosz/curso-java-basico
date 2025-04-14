package com.loiane.cursojava.aula24.exercicios;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.primeiroNome = "Marcos";
		contato.ultimoNome = "Silva";
		contato.email = "mlucas2001@hotmail.com";
		contato.endereco = "Rua Zé da Silva, 123";
		contato.favorito = true;
		
		contato.telefones = new String[3];
		contato.telefones[0] = "3213232423";
		contato.telefones[1] = "8656876877";
		contato.telefones[2] = "0924839424";
		
	}

}
