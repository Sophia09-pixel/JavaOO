package br.fiap.conta;

import java.util.Random;

import br.fiap.correntista.Correntista;

public abstract class Conta {

	private int numeroDaConta;
	private Correntista correntista;
	private String senha;
	private double saldo;
	
	public Conta(Correntista correntista, String senha, double saldo) {
		Random random = new Random();
		int x = random.nextInt(9000)+1000;
		this.numeroDaConta = x;
		this.correntista = correntista;
		this.senha = senha;
		this.saldo = saldo;
	}

	public Conta(Correntista correntista, String senha) {
		this.correntista = correntista;
		this.senha = senha;
	}
	
	public void sacar(double valor) {
		 this.saldo -= valor; 
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(Conta conta, double valor) {
			this.saldo -= valor;
			conta.depositar(valor);
	}

	@Override
	public String toString() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", correntista=" + correntista + ", saldo=" + saldo + "]";
	}

	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public String getSenha() {
		return senha;
	}

	public double getSaldo() {
		return saldo;
	}


}
