package main;

import aluno.Aluno;

public class Main {
	public static void main(String[] args) {
		
		Aluno[] aluno = new Aluno[5];
		
		// instanciar os alunos e armazenar no vetor
		aluno[0] = new Aluno("A", 0, 0, 0);
		aluno[1] = new Aluno("B", 8, 9.5, 7);
		aluno[2] = new Aluno("C", 2, 1, 0);
		aluno[3] = new Aluno("D", 1, 1, 1);
		aluno[4] = new Aluno("E", 2, 3.5, 4);
		
		// impressão da quantidade de alunos aprovados e reprovados
		int qtd = 0;
		for(Aluno a : aluno) {
			if(a.isAprovado()) {
				qtd++;
			}
		}
		System.out.println("Total de aprovados --> " + qtd);
		System.out.println("Total de reprovados --> " + (aluno.length - qtd));

		Aluno aux;
		String nome;
		
		for(int i =0;i<aluno.length;i++) {
			for(int j=0;j<aluno.length-1;j++) {
				if(aluno[j].calcularMedia()<aluno[j+1].calcularMedia()) {
					aux = aluno[j];
					aluno[j] = aluno[j+1];
					aluno[j+1] = aux;
					
				}
			}
		}
		
		System.out.println();
		System.out.println("Ordenação");
		for(int i =0;i<aluno.length;i++) {
			System.out.println(aluno[i].nome+" - "+aluno[i].calcularMedia());
		}
		
	}
}
