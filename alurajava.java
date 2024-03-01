package pastinha;

import java.util.Scanner;

public class alurajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		String nome;
		String tipoConta;
		double saldo =0;
		double tranferencia =0;
		double valorReceber =0;
		int operacao =0;
		
		System.out.println("Digite o seu nome:");
		nome = entrada.next();
		
		System.out.println("Digite o tipo de conta:");
		tipoConta = entrada.next();
		
		System.out.println("Digite o saldo atual:");
		saldo = entrada.nextDouble();
		
		System.out.println("***************************");
		System.out.println();
		System.out.println("Dados Iniciais do Cliente");
		System.out.println("Nome: "+nome);
		System.out.println("Tipo da conta: "+tipoConta);
		System.out.println("Saldo inicial: R$"+saldo);
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		
		System.out.println("Operações");
		System.out.println();
		System.out.println("1 - Consultar Dados");
		System.out.println("2 - Receber Valor");
		System.out.println("3 - Transferir Valor");
		System.out.println("4 - Sair");
		
		System.out.println("Digite a opção desejada:");
		operacao = entrada.nextInt();
		
		while(operacao != 4) {
		switch(operacao) {
		case 1:
			System.out.println("O saldo autal é: R$"+saldo);
			break;
		case 2:
			System.out.println("Digite o valor a receber: R$");
			valorReceber = entrada.nextDouble();
		    saldo += valorReceber;
		    System.out.println("Saldo Atualizado: R$"+saldo);
		    break;
		case 3:
			System.out.println("Digite o valor para a tranferencia: R$");
			tranferencia = entrada.nextDouble();
			saldo -= tranferencia;
			System.out.println("Saldo Atualizado: R$"+saldo);
			break;
			
			
		}
		System.out.println();
		System.out.println("Operações");
		System.out.println();
		System.out.println("1 - Consultar Dados");
		System.out.println("2 - Receber Valor");
		System.out.println("3 - Transferir Valor");
		System.out.println("4 - Sair");
		
		System.out.println("Digite a opção desejada:");
		operacao = entrada.nextInt();
		}
	 System.out.println("Obrigada pela preferencia :)");
	}
}
