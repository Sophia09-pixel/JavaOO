package br.fiap.app;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;
import br.fiap.venda.Venda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Venda> lista = new ArrayList<>();
		String listaCargo[] = { "Atendente", "Vendedor", "Gerente" };
		String nome;
		double salario, valorVenda;
		JComboBox<Cargo> combo = new JComboBox<>(Cargo.values());
		Cargo cargo;

		for (int i = 1; i <= 4; i++) {
			nome = showInputDialog("Nome:");
			salario = parseDouble(showInputDialog("Salario:"));
			showMessageDialog(null, combo, "Cargo do funcionario", ERROR_MESSAGE);
			cargo = (Cargo) combo.getSelectedItem();
			valorVenda = parseDouble(showInputDialog("Valor da venda"));
			Funcionario funcionario = new Funcionario(nome, salario, cargo);
			Venda venda = new Venda(funcionario, valorVenda);
			lista.add(venda);


		}
		
		for(Venda v: lista) {
			showMessageDialog(combo, v.getFuncionario().getNome()+"\n"+v.calcularComissao());
		}
		

	}

}
