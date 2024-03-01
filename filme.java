package br.com.alura.sreenmatch.modelos;

public class filme extends Titulo {
	private String diretor;

	public filme(String nome, int anoDeLancamento) {
		super(nome,anoDeLancamento);
	}


	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public int getClassificacao() {
		return (int)pegaMedia()/2;
	}
	
	public String toString() {
		return "Filme: "+ this.getNome() + " (" + this.getAnoDeLancamento()+")";
	}
}
