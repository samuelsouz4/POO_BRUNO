package br.com.main;

import br.com.classes.veiculo;

public class main {
   
	public static void main(String[] args) {
		
		//iniciando objeto
		veiculo carro = new veiculo ();
		carro.nome = "corsa";
		carro.cor = "amarelo";
		carro.motor = "16cv";
		carro.velocidade = 100;
		
		System.out.println( "nome: " + carro.nome);
		System.out.println( "cor: " + carro.cor);
		System.out.println( "motor: " + carro.motor);
		System.out.println( "velocidade: " + carro.velocidade);
		
		carro.ligar();
	}

}
