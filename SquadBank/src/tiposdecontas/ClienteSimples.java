package tiposdecontas;

import conta.Conta;

//herdar� da class Conta
public class ClienteSimples extends Conta {
	
  
	private String endereco;
	private String telefone;
	private String profissao;
	private String cargo;

	public ClienteSimples(String cliente, String cpf, int agencia, double saldo, String endereco, String telefone,
			String profissao, String cargo) {
		super(cliente, cpf, agencia, saldo);
		this.endereco = endereco;
		this.telefone = telefone;
		this.profissao = profissao;
		this.cargo = cargo;
	}
	// m�todo reaproveitado da class Conta

	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Endere�o: " + this.endereco);
		System.out.println("Telefone de Contato: " + this.telefone);
		System.out.println("Profiss�o: " +  this.profissao);
		System.out.println("Cargo: " + this.cargo);
	}
}
