package br.fiap.util;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

public class Util {
	private Viagem viagem = new Viagem();

	// cria e exibe o menu de opões para o usuário
	public void menu() {
		int opcao = 0;
		String aux = "Reserva de cargas Boa Viagem\n";
		aux += "1 - Reservar viagem\n";
		aux += "2 - Pesquisar reserva\n";
		aux += "3 - Visualizar reserva\n";
		aux += "4 - Capacidade reservada\n";
		aux += "5 - Cancelar reserva\n";
		aux += "6 - Finalizar\n";

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção Inválida!");
			} else {
				switch (opcao) {
				case 1:
					reservar();
					break;
				case 2:
					verificaReserva();
					break;

				case 3:
					exibirReservas();
					break;

				case 4:
					exibeCapacidadeTotal();
					break;

				case 5:
					removerCarga();
					break;

				}

			}
		} while (opcao != 6);

	}

	private void reservar() {
		int cnpj;
		String destino, nome;
		double peso;

		cnpj = parseInt(showInputDialog("CNPJ"));
		destino = showInputDialog("Destino");
		nome = showInputDialog("Nome do cliente");
		peso = parseDouble(showInputDialog("Peso em kg"));

		Cliente cliente = new Cliente(cnpj, nome);
		Carga carga = new Carga(destino, peso, cliente);
		if (viagem.reservar(carga)) {
			showMessageDialog(null, "Reserva realizada com sucesso");
		} else {
			showMessageDialog(null, "Não foi possivel realizar a reserva");
		}

	}

	private void verificaReserva() {
		int cnpj;
		cnpj = parseInt(showInputDialog("CNPJ"));
		showMessageDialog(null, viagem.pesquisar(cnpj));

	}

	private void exibirReservas() {
		showMessageDialog(null, viagem.getDados());
	}

	private void exibeCapacidadeTotal() {
		showMessageDialog(null, "Capacidade total até o momento: " + viagem.capacidadeReservada());
	}

	private void removerCarga() {
		int cnpj;
		showMessageDialog(null, "Digite os dados para remover");
		cnpj = parseInt(showInputDialog("CNPJ"));
		showMessageDialog(null, viagem.cancelarReserva(cnpj));

	}

}
