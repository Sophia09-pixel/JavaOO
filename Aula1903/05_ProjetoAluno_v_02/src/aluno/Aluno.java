package aluno;
import java.util.Random;

import disciplina.Disciplina;

public class Aluno {
	// variáveis de instância
	private String nome;
	private int rm;
	private Disciplina[] disciplina;

	// método construtor
	public Aluno(String nome, Disciplina[] disciplina) {
		this.rm = gerarRM();
		this.setNome(nome);
		this.disciplina = disciplina;
	}

	// método para gerar o valor do RM do aluno
	private int gerarRM() {
		Random rd = new Random();
		return rd.nextInt(20000, 100000);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRm() {
		return rm;
	}

	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	
	

}
