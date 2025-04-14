package com.loiane.cursojava.aula36.exercicios;

import java.util.Scanner;

public class TesteEX1 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		System.out.print("Insira o nome da sua agenda: ");
		agenda.setNome(scan.nextLine());
		
		Contato[] contatos = new Contato[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("Contato " + (i+1));
			Contato contatoAuxiliar = new Contato();
			contatos[i] = inserirContato(contatoAuxiliar);
		}
		
		agenda.setContatos(contatos);
		agenda.infoTodosOsContatos();
	}
	
	public static Contato inserirContato(Contato contato) {
		System.out.print("Nome: ");
		contato.setNome(scan.nextLine());
		System.out.print("Telefone: ");
		contato.setTelefone(scan.nextLine());
		System.out.print("Email: ");
		contato.setEmail(scan.nextLine());
		
		return contato;
	}

}
