package tiposdecontas;

import conta.Conta;
//herdará da class Conta
public class ClienteSimples extends Conta {

	private String endereco;
	private String telefone;
	private String profissao;
	private String cargo;

	public ClienteSimples(String cliente, String cpf, int agencia, double saldo, String endereco, String telefone,
			String profissao, String cargo) {
		super(cliente, cpf, agencia);
		this.endereco = endereco;
		this.telefone = telefone;
		this.profissao = profissao;
		this.cargo = cargo;
	}
}
