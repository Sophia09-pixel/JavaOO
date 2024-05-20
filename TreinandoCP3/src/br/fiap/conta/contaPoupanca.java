package br.fiap.conta;

import br.fiap.correntista.Correntista;
import br.fiap.data.Data;
import br.fiap.interfaces.atualizarSaldo;

public class contaPoupanca extends Conta implements atualizarSaldo{

	private Data dataNasc;

	public contaPoupanca(Correntista correntista, String senha) {
		super(correntista, senha);
		
	}

	public contaPoupanca( Correntista correntista, String senha, double saldo,Data data) {
		super(correntista, senha, saldo);
		this.dataNasc = data;
	}

	@Override
	public String toString() {
		return super.toString()+"dataNasc=" + dataNasc + "";
	}

	@Override
	public void atualizarSaldo(double porc) {
		if(this.dataNasc.getDia()==10) {
			double atualizar = this.getSaldo() * (porc/100);
			this.depositar(atualizar);
		}
	}

	public Data getDataNasc() {
		return dataNasc;
	}
	
}
