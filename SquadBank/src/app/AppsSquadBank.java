package app;

import conta.Conta;
import tiposdecontas.ClienteEspecial;
import tiposdecontas.ClienteSimples;

public class AppsSquadBank {
	public static void main(String[] args) {

		ClienteSimples cs1 = new ClienteSimples("Clau Pinheiro ", "123.456.789-99", 123, 0,
				"Rafael Assayag 78 Manaus - Am", "9423-6782", "Programador", "Analista Jr");

		cs1.deposita(500);

		System.out.println("Nome do Cliente :" + cs1.getCliente());
		System.out.println("Número da Agência" + cs1.getAgencia());
		System.out.println("Número do CPF :" + cs1.getCpf());
		System.out.println("Saldo atual da conta R$ :" + cs1.getSaldo());

		ClienteEspecial ce1 = new ClienteEspecial("Thomas Messi", "654.456.789-58", 777, 1250,
				"Rion Negro 1750 Manaus - Amazonas", "3234-5656", "Programador", "Engenheiro de Software", 850);
		ce1.deposita(3000);

		System.out.println("Nome do Cliente :" + ce1.getCliente());
		System.out.println("Número da Agência" + ce1.getAgencia());
		System.out.println("Número do CPF :" + ce1.getCpf());
		System.out.println("Saldo atual da conta R$ :" + ce1.getSaldo());

		System.out.println("Thomas vai transferir R$ 200 para Conta do Clau Pinheiro");

		ce1.transfere(200, cs1);
		System.out.println("O saldo atual da Conta do Clau Pinheiro é R$ :" + cs1.getSaldo());
		System.out.println("O saldo da Conta Thomas Messi é de R$ :" + ce1.getSaldo());
	}

}