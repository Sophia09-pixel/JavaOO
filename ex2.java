import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);

	       
	        System.out.print("Digite o valor de i: ");
	        int num1 = entrada.nextInt();

	        System.out.print("Digite o valor de j: ");
	        int num2 = entrada.nextInt();

	        int maxCiclo = 0;

	        
	        for (int i = num1; i <= num2; i++) {
	            int ciclos = verificaCiclos(i);

	           
	            if (ciclos > maxCiclo) {
	                maxCiclo = ciclos;
	            }
	        }

	       
	        System.out.println("O número máximo de impressões para todos os inteiros entre " + num1+ " e " + num2 + " é: " + maxCiclo);
	    }

	   
	    private static int verificaCiclos(int n) {
	        int ciclos = 0;

	        while (n != 1) {
	            if (n % 2 == 1) {
	                n = 3 * n + 1;
	            } else {
	                n = n / 2;
	            }
	            ciclos++;
	        }

	        return ciclos + 1;
	    }
	}
