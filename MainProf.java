package ex3;

import java.util.Scanner;

public class MainProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a qtd de professores: ");
		int qtdProf = entrada.nextInt();

		for (int i = 0; i < qtdProf; i++) {
			Professor professor = new Professor();

			System.out.print("Digite o nome do Professor(a)(" + (i + 1) + "): ");
			professor.Nome = entrada.next();

			System.out.print("Digite a quatidade de aulas semanais do professor(a) " + professor.Nome + ": ");
			professor.numAulaSemanal = entrada.nextInt();

			System.out.print("Digite o valor da hora-aula: ");
			professor.horaAula = entrada.nextDouble();

			professor.calculaSalarioBase();
			professor.calculaAdicional();
			professor.calculaDescanso(i);

			System.out.println("Salário Bruto do Professor(a): " + professor.Nome + " R$"
					+ String.format("%.2f", professor.getSalarioBruto()));
			System.out.println();
		}

	}

}
