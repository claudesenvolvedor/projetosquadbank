package conta;

public class Conta {

	private String cliente;
	private String cpf;
	private int agencia;
	private double saldo;

	public Conta(String cliente, String cpf, int agencia, double saldo) {
		this.cliente = cliente;
		this.cpf = cpf;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public void mostrarDados() {
		System.out.println(this.getCliente() + this.getCpf() + this.getAgencia() + this.getSaldo());

	}
}