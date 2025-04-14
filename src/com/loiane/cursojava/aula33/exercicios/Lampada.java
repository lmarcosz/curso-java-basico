package com.loiane.cursojava.aula33.exercicios;

public class Lampada {
	
	private String marca;
	private String modelo;
	private String tipoLuz;
	private String cor;
	private double potencia;
	private double brilho;
	private String tensao;
	private boolean acesa;
	
	public Lampada(){
		this.acesa = false;
	}
	
	public Lampada(String marca, String modelo, String tipoLuz, String cor, double potencia, double brilho,
			String tensao, boolean acesa) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipoLuz = tipoLuz;
		this.cor = cor;
		this.potencia = potencia;
		this.brilho = brilho;
		this.tensao = tensao;
		this.acesa = acesa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getBrilho() {
		return brilho;
	}

	public void setBrilho(double brilho) {
		this.brilho = brilho;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public boolean isAcesa() {
		return acesa;
	}

	public void setAcesa(boolean acesa) {
		this.acesa = acesa;
	}
	
	private void mensagemEstadoLampada(boolean estado) {
		String mensagem = (estado) ? "Lâmpada acesa!" : "Lâmpada apagada!";
		System.out.println(mensagem);
	}
	
	public void ligarLampada() {
		setAcesa(true);
		this.mensagemEstadoLampada(isAcesa());
	}
	
	public void desligarLampada() {
		setAcesa(false);
		this.mensagemEstadoLampada(isAcesa());
	}
	
	public void mudarEstadoLampada() {
		this.acesa = (this.acesa) ? false : true;
		this.mensagemEstadoLampada(isAcesa());
	}
	
}
