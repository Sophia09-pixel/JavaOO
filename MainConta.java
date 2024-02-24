import java.util.Scanner; 

public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		Conta conta1 = new Conta();
		
		conta1.saldo = 3500;
		
		System.out.print("Digite a sua Agencia: ");
		conta1.setAgencia(entrada.nextInt());
		
		System.out.println("Agencia: "+conta1.getAgencia());
		
		System.out.print("Digite o numero da sua Conta: ");
		conta1.numConta = entrada.nextInt();
		
		System.out.print("Digite o valor do depósito que deseja fazer: ");
		conta1.deposita(entrada.nextDouble());
		conta1.consulta();
		
		System.out.println("Digite o valor que deseja sacar: ");
		conta1.saca(entrada.nextDouble());
		conta1.consulta();
	}

}
