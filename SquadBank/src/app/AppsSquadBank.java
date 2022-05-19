package app;

import conta.Conta;
import tiposdecontas.ClienteSimples;

public class AppsSquadBank {
	public static void main(String[] args) {

		ClienteSimples cs1 = new ClienteSimples("Clau Pinheiro", "123.456.789-99", 123, 0,
				"Rafael Assayag 78 Manaus - Am", "9423-6782", "Programador", "Analista Jr");

		cs1.mostrarDados();

	}
}
