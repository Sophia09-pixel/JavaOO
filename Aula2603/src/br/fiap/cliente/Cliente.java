package br.fiap.cliente;

public class Cliente {
	private int cnpj;
	private String cliente;

	public Cliente(int cnpj, String cliente) {
		this.cnpj = cnpj;
		this.cliente = cliente;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDados() {
		return "Cliente: " + getCliente() + " - cnpj: " + getCnpj();
	}

}
