package br.fiap.venda;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;

public class Venda {

	private Funcionario funcionario;
	private double valor;

	public Venda(Funcionario funcionario, double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double calcularComissao() {
		Cargo cargo = funcionario.getCargo();
		double comissao = cargo.calcularComissao(valor);		
		return comissao;		
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
