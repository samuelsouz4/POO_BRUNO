package br.com.projeto;


import br.com.classes.Cliente;
import br.com.classes.Diarista;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diarista diarista = new Diarista();
		
		diarista.nome = "joao";
		diarista.telefone = "(11) 98501-7672";
		diarista.endereço = "casa da mãe joana n 71";
		diarista.chavepix = "123";
		
		
		System.out.println("Nome Diarista:" + diarista.nome);
		System.out.println("Telefone Diarista:" + diarista.telefone);
		System.out.println("Endereço Diarista:" + diarista.endereço);
		System.out.println( "chave pix diarista:" + diarista.chavepix);
		diarista.atender("josé");
		
		
		System.out.println("======================================");
		 
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Daniel";
		cliente.telefone = "9002 8922";
		cliente.endereço = " logo ali";
		cliente.saldo = 100;
		
		System.out.println("Nome Cliente:" + cliente.nome);
		System.out.println("Telefone Cliente:" + cliente.telefone);
		System.out.println("Endereço Cliente:" + cliente.endereço);
		
		
	

	}

}
