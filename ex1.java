import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int n = 0;

		System.out.print("Digite um número: ");
		n = entrada.nextInt();
		
		while (n != 1) {
			System.out.println(n);
			if (n == 0) {
				break;
			}
			if (n % 2 == 1) {
				n = 3 * n + 1;
			} else {
				n = n / 2;
			}
		}
		System.out.println(n);
	}

}
