package br.salao.funcionario;

import br.salao.cliente.Cliente;

public class Funcionario {

	private String nome;
	private String procedimento;
	private int horario;
	private Cliente cliente;

	public Funcionario(String nome, String procedimento, Cliente cliente,int horario) {
		this.nome = nome;
		this.procedimento = procedimento;
		this.cliente = cliente;
		this.horario = horario;
	}

	public String getDados() {
		return " Funcionaria: " + getNome() + "\n" + "Procedimento:" + getProcedimento() + "\n" + "Horario:"
				+ getHorario() + "\n" +  cliente.getDados();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

}
