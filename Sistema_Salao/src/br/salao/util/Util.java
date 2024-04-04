package br.salao.util;

import br.salao.atendimento.Atendimento;
import br.salao.cliente.Cliente;
import br.salao.funcionario.Funcionario;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Util {
	private Atendimento atendimento = new Atendimento();

	public void menu() {
		int opcao = 0;
		String aux = "Agendar procedimento LSHAIR\n";
		aux += "1 - Agendar procedimento\n";
		aux += "2 - Pesquisar agendamento\n";
		aux += "3 - Visualizar agendamento\n";
		aux += "4 - Cancelar agendamento\n";
		aux += "5 - Finalizar\n";

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 5) {
				showMessageDialog(null, "Opção Inválida!");
			} else {
				switch (opcao) {
				case 1:
					agendar();
					break;
				case 2:
					pesquisarAgendamento();
					break;
					
				case 3:
					visualisarAtendimentos();
					break;
				case 4:
					cancelarAtendimento();
				}
			}
		} while (opcao != 5);
	}

	private void cancelarAtendimento() {
		String nome;
		int numero;
		showMessageDialog(null,"Digite os dados para cancelar");
		nome = showInputDialog("Digite o seu nome");
		numero = parseInt(showInputDialog("Digite seu telefone"));
		showMessageDialog(null, atendimento.cancelar(nome, numero));
		
	}

	private void visualisarAtendimentos() {
		showMessageDialog(null, atendimento.getDados());
	}

	private void pesquisarAgendamento() {
		String nome;
		int numero;
		
		nome = showInputDialog("Digite o nome para pesquisar");
		numero = parseInt(showInputDialog("Digite seu telefone para pesquisar"));
		
		showMessageDialog(null,atendimento.pesquisar(nome, numero));
		
	}

	private void agendar() {
		String nome;
		int numero;
		
		nome = showInputDialog("Digite o seu nome: ");
		numero = parseInt(showInputDialog("Digite o seu telefone"));
		Cliente cliente = new Cliente(nome, numero);
		
		String funcionario;
		String procedimento;
		int hora;
		
		funcionario = showInputDialog("Digite o nome do funcionario que gostaria de ser atendido");
		procedimento = showInputDialog("Digite o procedimento que gostaria de fazer");
		hora = parseInt(showInputDialog("Digite o horario"));
		
		Funcionario funcionario1 = new Funcionario(funcionario,procedimento,cliente,hora);
		
		if(atendimento.agendar(funcionario1)) {
			showMessageDialog(null, "Agendamento feito com sucesso");
		}else {
			showMessageDialog(null, "Horario cheio ou indisponivel");
		}
		
		
	}
}
