package conta;

public class Conta {

	private String cliente;
	private String cpf;
	private double agencia;
	private double saldo;

	public Conta(String cliente, String cpf, double agencia, double saldo) {
		this.cliente = cliente;
		this.cpf = cpf;
		this.agencia = agencia;
		this.saldo = saldo;
	}
}