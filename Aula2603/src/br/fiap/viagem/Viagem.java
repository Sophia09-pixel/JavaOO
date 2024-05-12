package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {

	private double capacidade;
	private int index;
	private Carga carga[];

	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];
	}

	public boolean reservar(Carga carga) {
		if (permitidoReservar(carga.getPeso())) {
			this.carga[index] = carga;
			this.index++;
			return true;
		}
		return false;
	}

	public double capacidadeReservada() {
		double totalPeso = 0;
		for (int i = 0; i < this.index; i++) {
			totalPeso += carga[i].getPeso();
		}

		return totalPeso;
	}

	private boolean permitidoReservar(double peso) {
		return capacidadeReservada() + peso <= 10000;
	}

	public String getDados() {
		String aux = "";
		if (index > 0) {
			for (int i = 0; i < index; i++) {
				aux += "Carga (" + (i + 1) + "): " + carga[i].getDados() + "\n";
			}
			return aux;
		} else {
			return "Nenhuma carga reservada";
		}

	}

	public String pesquisar(int cnpj) {
		for (int i = 0; i < index; i++) {
			if (cnpj == carga[i].getCliente().getCnpj()) {
				return "Caga encontrada: " + carga[i].getDados();
			}
		}
		return "Dados não encontrados";
	}

	public String cancelarReserva(int cnpj) {

		for (int i = 0; i < index; i++) {
			if (cnpj == carga[i].getCliente().getCnpj()) {
				for (int j = i; j < index - 1; j++) {
					this.carga[j] = this.carga[j + 1];
				}
				this.carga[index - 1] = null;
				index--;

				return "Reserva removida com sucesso";
			}

		}
		return "Reserva não encontrada";
	}
}
