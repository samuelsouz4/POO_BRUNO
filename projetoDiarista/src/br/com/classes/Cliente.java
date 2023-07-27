package br.com.classes;

public class Cliente extends Pessoa  {
	
	
	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor + ( valor * 0.1);
		this.setSaldo(novoSaldo);
				
	
	 
	}
	

}
