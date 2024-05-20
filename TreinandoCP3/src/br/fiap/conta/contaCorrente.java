package br.fiap.conta;

import br.fiap.correntista.Correntista;
import br.fiap.interfaces.atualizarLimite;

public class contaCorrente extends Conta implements atualizarLimite{

	private double limite;

	public contaCorrente(Correntista correntista, String senha) {
		super(correntista, senha);
	}

	public contaCorrente(Correntista correntista, String senha, double saldo) {
		super(correntista, senha, saldo);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return super.toString()+" limite =" + limite + "]";
	}

	@Override
	public void atualizarLimite(double porc) {
		double atualizar = this.limite * (porc/100);
		this.limite += atualizar;
	}
	
	
}
