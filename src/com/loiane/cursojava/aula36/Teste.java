package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Sara");
		//contato.setEndereco("Rua Morena do Sorriso Lindo");
		//contato.setTelefone("123456789");
		
		//criando objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Morena do Sorriso Lindo");
		end.setNumero("123");
		end.setComplemento("Mansão da Morena");
		end.setCidade("Sampa meo");
		end.setEstado("SP");
		end.setCep("Meu coração");
		
		contato.setEndereco(end);
		
		//criando objeto telefone 1
		Telefone tel1 = new Telefone();
		tel1.setTipo("Celular");
		tel1.setDdd("011");
		tel1.setNumero("123456789");
		
		//criando objeto telefone 2
		Telefone tel2 = new Telefone();
		tel2.setTipo("Residencial");
		tel2.setDdd("012");
		tel2.setNumero("33333333");
		
		//criando objeto telefone 3
		Telefone tel3 = new Telefone();
		tel3.setTipo("Profissional");
		tel3.setDdd("011");
		tel3.setNumero("444444444");
		
		//criando um array para armazenar os telefones
		Telefone[] telefones = new Telefone[3];
		
		telefones[0] = tel1;
		telefones[1] = tel2;
		telefones[2] = tel3;
		
		//passando o array de telefones para o contato
		contato.setTelefones(telefones);
		
		;
		//contato.setTelefone(tel);
		
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco());
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCep());
		}
		
		//Acessando ddd e número de cada telefone do contato
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}

}
