package br.fiap.carga;

import java.util.Random;

import br.fiap.cliente.Cliente;

public class Carga {

	private int id;
	private String destino;
	private double peso;
	private Cliente cliente;

	public Carga(String destino, Cliente cliente) {
		this(destino, 0, cliente);
		this.peso = gerarPeso();
	}

	public Carga(String destino, double peso, Cliente cliente) {
		this.destino = destino;
		this.peso = peso;
		this.cliente = cliente;
		this.id = gerarId();

	}

	public String getDados() {
		return getDestino() + "\n" + getPeso() + "\n" + cliente.getDados();
	}

	private double gerarPeso() {
		Random rd = new Random();
		return rd.nextDouble(10, 2500);
	}

	private int gerarId() {
		Random rd = new Random();
		return rd.nextInt(1, 1000);
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
