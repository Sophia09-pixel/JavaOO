package br.salao.cliente;

public class Cliente {

	private String cliente;
	private int numero;
	
	public Cliente(String cliente,int numero) {
		this.cliente = cliente;
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDados() {
		return "Cliente: "+getCliente()+" - número: "+getNumero();
	}
}
