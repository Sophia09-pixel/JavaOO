package aluno;
import java.util.Random;

public class Aluno {
	// variáveis de instância
	public String nome;
	int rm;
	double nota1;
	double nota2;
	double nota3;
	
	// método construtor
	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.rm = gerarRM();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	// método para gerar o valor do RM do aluno
	private int gerarRM() {
		Random rd = new Random();
		return rd.nextInt(20000, 100000);
	}
	
	// método para calcular e retornar a média do aluno
	public double calcularMedia() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	// método para verificar se um aluno está aprovado
	public boolean isAprovado() {
		return calcularMedia() >= 6 ? true : false;
	}	
}
