package br.fiap.util;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.ArrayList;
import java.util.List;

import br.fiap.conta.Conta;
import br.fiap.conta.contaCorrente;
import br.fiap.conta.contaPoupanca;
import br.fiap.correntista.Correntista;
import br.fiap.data.Data;

public class Util {

	private List<Conta> listaContasAtivas = new ArrayList();
	private List<Conta> listaContasFechadas = new ArrayList();

	public void menu() {
		int opcao;
		do {
			String aux = "";
			aux += "==== BANCO FIAP ====" + "\n";
			aux += "1. Abrir conta" + "\n";
			aux += "2. Pesquisar Conta" + "\n";
			aux += "3. Acessar Conta" + "\n";
			aux += "4. Finalizar" + "\n";

			opcao = parseInt(showInputDialog(aux));

			switch (opcao) {

			case 1:
				criarConta();
				break;

			case 2:
				pesquisarConta();
				break;

			case 3:
				acessarConta();
				break;
			}
		} while (opcao != 4);
	}

	private void criarConta() {
		int opcao;

		opcao = parseInt(showInputDialog("Abrir Conta: 1-Corrente / 2 - Conta Poupanca"));
		while (opcao > 2 || opcao < 1) {
			opcao = parseInt(showInputDialog("Digite uma opcao válida: (1/2)"));
		}

		if (opcao == 1) {
			String nome;
			String cpf;
			nome = showInputDialog("Digite o nome");
			cpf = showInputDialog("Digite o cpf");

			Correntista correntista = new Correntista(nome, cpf);

			String senha;
			double saldo;

			senha = showInputDialog("Digite a senha");
			saldo = parseDouble(showInputDialog("Digite o saldo"));

			Conta contaCorrente = new contaCorrente(correntista, senha, saldo);
			showMessageDialog(null, contaCorrente);

			listaContasAtivas.add(contaCorrente);

		} else {
			if (opcao == 2) {
				String nome;
				String cpf;
				nome = showInputDialog("Digite o nome");
				cpf = showInputDialog("Digite o cpf");

				Correntista correntista = new Correntista(nome, cpf);

				String senha;
				double saldo;

				senha = showInputDialog("Digite a senha");
				saldo = parseDouble(showInputDialog("Digite o saldo"));
				int dia, mes, ano;
				dia = parseInt(showInputDialog("Dia do nascimento"));
				mes = parseInt(showInputDialog("Mes do nascimento"));
				ano = parseInt(showInputDialog("Ano do nascimento"));

				Data data = new Data(dia, mes, ano);

				Conta contaPoupanca = new contaPoupanca(correntista, senha, saldo, data);
				listaContasAtivas.add(contaPoupanca);

				showMessageDialog(null, contaPoupanca);
			}
		}

	}

	private void pesquisarConta() {
		String cpf;
		cpf = showInputDialog("Digite o cpf do correntista");
		boolean contaEncontrada = false;

		if (listaContasAtivas.isEmpty()) {
			showMessageDialog(null, "Nenhuma conta criada");
		} else {
			for (Conta conta : listaContasAtivas) {
				if (cpf.equalsIgnoreCase(conta.getCorrentista().getCpf())) {
					contaEncontrada = true;
					showMessageDialog(null, "Conta encontrada: " + "\n" + conta);
				}
			}
			
			if (!contaEncontrada) {
			    showMessageDialog(null, "Conta não encontrada");
			}
		}
	}

	private void acessarConta() {
		int numConta;
		String senha;

		numConta = parseInt(showInputDialog("Digite o numero da conta para acessar"));
		senha = showInputDialog("Digite a senha para acessar a conta");

		if (listaContasAtivas.isEmpty()) {
			showMessageDialog(null, "Não há contas existentes");
		} else {
			for (Conta conta : listaContasAtivas) {
				if (numConta == conta.getNumeroDaConta() && senha.equalsIgnoreCase(conta.getSenha())) {
					int opcao;
					do {
						String aux="";
						aux += "==== Operacoes Bancárias ====" + "\n";
						aux += "1. Sacar" + "\n";
						aux += "2. Depositar" + "\n";
						aux += "3. Transferir" + "\n";
						aux += "4. Consultar Saldo" + "\n";
						aux += "5. Fechar Conta" + "\n";
						aux += "6. Finalizar" + "\n";
						opcao = parseInt(showInputDialog(aux));
						
						switch(opcao) {
						case 1:
							sacar(conta);
							break;
						case 2:
							depositar(conta);
							break;
						case 3:
							transferir(conta);
							break;
							
						case 4:
							consultarSaldo(conta);
							break;
						case 5:
							removerConta(conta);
							break;
						}
					} while (opcao!=6);
				}
			}
		}
	}

	private void removerConta(Conta conta) {
		String resp;
		resp = showInputDialog("Deseja encerrar a sua conta? S/N");
		while(!resp.equalsIgnoreCase("S")&&!resp.equalsIgnoreCase("N")) {
			resp = showInputDialog("Resposta Inválida: S/N");
		}
		if(resp.equalsIgnoreCase("S")){
			listaContasFechadas.add(conta);
			listaContasAtivas.remove(conta);
			showMessageDialog(null, "Conta Encerrada");
		}
	}

	private void consultarSaldo(Conta conta) {
		showMessageDialog(null, "R$: "+conta.getSaldo());
		
	}

	private void transferir(Conta conta) {
		int numContaDestino;
		double valor;
		boolean contaEncontrada = false;
		numContaDestino = parseInt(showInputDialog("Numero da conta para transferencia"));
		
		for (Conta conta2 : listaContasAtivas) {
			if(numContaDestino == conta2.getNumeroDaConta()) {
				valor = parseDouble(showInputDialog("Digite o valor"));
				conta.transferir(conta2, valor);
				contaEncontrada = true;
			}
			
		}
		
		if (!contaEncontrada) {
		    showMessageDialog(null, "Conta não encontrada");
		}
		
	}

	private void depositar(Conta conta) {
		double valor;
		valor = parseInt(showInputDialog("Valor a ser depositado"));
		conta.depositar(valor);
		
	}

	private void sacar(Conta conta) {
		double valor;
		valor = parseDouble(showInputDialog("Valor a ser sacado"));
		conta.sacar(valor);
	}
}
