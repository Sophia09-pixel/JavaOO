package br.com.alura.sreenmatch.modelos;

public class Serie extends Titulo{

	public Serie(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}

	private int temporadas;
	private int episodiosPorTemporada;
	private boolean ativa;
	private int minutosPorEp;
	
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getMinutosPorEp() {
		return minutosPorEp;
	}
	public void setMinutosPorEp(int minutosPorEp) {
		this.minutosPorEp = minutosPorEp;
	}
	
	public int getDuracaoMinutos() {
		return temporadas * episodiosPorTemporada * minutosPorEp;
	}
	
	public String toString() {
		return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento()+")";
	}
	
}
