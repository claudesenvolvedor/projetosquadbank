package tiposdecontas;

import conta.Conta;

//herdará da class Conta
public class ClienteEspecial extends Conta {

	private String endereco;
	private String telefone;
	private String profissao;
	private String cargo;
	private double limite;

	// Construtor da Class ClienteEspecial

	public ClienteEspecial(String cliente, String cpf, int agencia, double saldo, String endereco, String telefone,
			String profissao, String cargo, double limite) {
		super(cliente, cpf, agencia, saldo);
		this.endereco = endereco;
		this.telefone = telefone;
		this.profissao = profissao;
		this.cargo = cargo;
		this.limite = limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// método reaproveitado da class Conta

	public void mostrarDados() {
		super.mostrarDados();
		System.out.println(this.endereco + this.telefone + this.profissao + this.cargo + this.limite);

	}

}
