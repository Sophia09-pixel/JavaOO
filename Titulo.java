package br.com.alura.sreenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private double somaDeAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoMinutos;
	
	
	
	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	
	public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}
	
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	
	
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: "+nome);
		System.out.println("Ano de Lançamento: "+anoDeLancamento);
			
	}

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {
	return somaDasAvaliacoes/totalDeAvaliacoes;	
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}
	
	
	
}
