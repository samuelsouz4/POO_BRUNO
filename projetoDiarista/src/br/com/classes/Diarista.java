package br.com.classes;

public class Diarista extends Pessoa {
	
	protected String chavePix; 

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public void atender(String nomeCliente) {
		
		System.out.println("REALAIZANDO ATENDIMENTO PARA CLIENTE:" + nomeCliente);
		
	}

	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int valor) {
		// TODO Auto-generated method stub
		
	}

}
