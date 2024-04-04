package br.salao.atendimento;

import br.salao.funcionario.Funcionario;

public class Atendimento {

	private Funcionario funcionario[];
	private int index;

	public Atendimento() {
		this.funcionario = new Funcionario[20];
		this.index = 0;
	}

	public boolean agendar(Funcionario funcionario) {
		if (permitidoAgendar(funcionario.getHorario())) {
			this.funcionario[index] = funcionario;
			this.index++;
			return true;
		}
		return false;
	}

	public String cancelar(String nome, int numero) {
		for (int i = 0; i < index; i++) {
			if (nome.equalsIgnoreCase(funcionario[i].getCliente().getCliente())
					|| numero == funcionario[i].getCliente().getNumero()) {
				for (int j = i; j < index - 1; j++) {
					this.funcionario[j] = this.funcionario[j + 1];
				}
				this.funcionario[index - 1] = null;
				index--;

				return "Atendimento removido com sucesso";
			}
		}
		return "Dados não encontrados";
	}

	public String pesquisar(String nome, int numero) {
		for (int i = 0; i < index; i++) {
			if (nome.equalsIgnoreCase(funcionario[i].getCliente().getCliente())
					|| numero == funcionario[i].getCliente().getNumero()) {
				return "Agendamento encontrado: " + funcionario[i].getDados();
			}
		}
		return "Nenhum atendimento agendado";
	}

	public boolean permitidoAgendar(int horario) {
		return horario >= 8 && horario <= 20;
	}

	public String getDados() {
		String aux = "";
		if (index > 0) {
			for (int i = 0; i < index; i++) {
				aux += "(" + (i + 1) + ") " + funcionario[i].getDados() + "\n";
			}
			return aux;
		} else {
			return "Nenhuma carga reservada";
		}

	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}

	public int getIndex() {
		return index;
	}

}
