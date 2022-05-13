package tiposdecontas;

import conta.Conta;

//herdará de Conta
public class ClienteSimples extends Conta {
	private String endereco;
	private String telefone;
	private String profissao;
	private String cargo;

//Construtor reaproveitando atributos da Conta
	public ClienteSimples(String cliente, String cpf, double agencia, double saldo, String endereco, String telefone,
			String profissao, String cargo) {
		super(cliente, cpf, agencia, saldo);
		this.endereco = endereco;
		this.telefone = telefone;
		this.profissao = profissao;
		this.cargo = cargo;
	}

}
