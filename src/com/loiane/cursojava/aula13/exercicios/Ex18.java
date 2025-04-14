package com.loiane.cursojava.aula13.exercicios;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Tamanho do arquivo (em MB): ");
		float tamanhoArquivo = scan.nextFloat();
		
		System.out.print("Velocidade (em Mbps): ");
		float velocidade = scan.nextFloat();
		
		float tempoDownloadSeg = (tamanhoArquivo/velocidade);
		int tempoDownloadMin = (int)(tempoDownloadSeg/60);
		
		System.out.println("Tempo de download do arquivo: " + tempoDownloadMin + "min");

	}

}
