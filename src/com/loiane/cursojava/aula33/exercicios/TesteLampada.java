package com.loiane.cursojava.aula33.exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		//Inserindo dados
		lamp.setAcesa(false);
		lamp.setMarca("Philips");
		lamp.setBrilho(1600);
		lamp.setCor("Amarela");
		lamp.setModelo("Comum");
		lamp.setPotencia(12);
		lamp.setTensao("Bivolt");
		
		//Obtendo dados
		System.out.println(lamp.getMarca());
		System.out.println(lamp.getPotencia());
		System.out.println(lamp.getCor());
		
		//Chamando métodos
		lamp.ligarLampada();
		lamp.desligarLampada();
		lamp.desligarLampada();
		lamp.mudarEstadoLampada();
		lamp.mudarEstadoLampada();
		lamp.mudarEstadoLampada();
		
	}

}
