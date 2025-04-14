package com.loiane.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		
		//Não é possível instanciar classe abstrada
		//Pessoa pessoa = new Pessoa();
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
	}

}
