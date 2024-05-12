package disciplina;
import java.util.Random;

public class Disciplina {
	// variáveis de instância
	private int codigo;
	private String nome;
	private double mediaCheckPoint;
	private double mediaSprint;
	private double notaGlobalSolution;
	
	// construtor
	public Disciplina(String nome, double mediaCheckPoint, double mediaSprint, double notaGlobalSolution) {
		this.codigo = gerarCodigo();
		this.nome = nome;
		this.mediaCheckPoint = mediaCheckPoint;
		this.mediaSprint = mediaSprint;
		this.notaGlobalSolution = notaGlobalSolution;
	}
	
	// método para gerar o código da disciplina
	public int gerarCodigo() {
		Random rd = new Random();
		return rd.nextInt(1000, 10000);
	}
	
	// método para calcular e retornar a média da disciplina
	
	public double calcularMedia() {
		return (mediaCheckPoint * 0.2 + mediaSprint * 0.3 + notaGlobalSolution * 0.5);
	}

	// método para verificar se um aluno está aprovado
	public boolean isAprovado() {
		
		return calcularMedia() >= 6;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getMediaCheckPoint() {
		return mediaCheckPoint;
	}

	public double getMediaSprint() {
		return mediaSprint;
	}

	public double getNotaGlobalSolution() {
		return notaGlobalSolution;
	}
	
	
	
	
}
