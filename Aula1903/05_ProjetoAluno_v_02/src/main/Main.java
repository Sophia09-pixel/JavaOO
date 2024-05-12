package main;

import aluno.Aluno;
import disciplina.Disciplina;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno[] = new Aluno[3];

		Disciplina[] disciplina;
		// aluno1
		disciplina = new Disciplina[2];
		disciplina[0] = new Disciplina("POO", 10, 9, 9);
		disciplina[1] = new Disciplina("Estatistica", 8, 7, 9);
		aluno[0] = new Aluno("Sophia", disciplina);

		// aluno2
		disciplina = new Disciplina[2];
		disciplina[0] = new Disciplina("CAP", 10, 10, 10);
		disciplina[1] = new Disciplina("ENG", 9, 9, 9);
		aluno[1] = new Aluno("Selmini", disciplina);

		// aluno3
		disciplina = new Disciplina[2];
		disciplina[0] = new Disciplina("Web", 7, 10, 8);
		disciplina[1] = new Disciplina("Redes", 0, 5, 3);
		aluno[2] = new Aluno("Roberto", disciplina);

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Nome: " + aluno[i].getNome());
			for (int j = 0; j < aluno[i].getDisciplina().length; j++) {
				System.out.println("Disciplina: " + aluno[i].getDisciplina()[j].getNome() + " - Média: "
						+ aluno[i].getDisciplina()[j].calcularMedia());
				System.out.println("Situação: "+aluno[i].getDisciplina()[j].isAprovado());
			}
			System.out.println();
		}

	}

}
