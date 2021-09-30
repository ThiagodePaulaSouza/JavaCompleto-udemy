import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double vlrPorPecas1 = sc.nextDouble();

		int codPeca2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double vlrPorPecas2 = sc.nextDouble();

		sc.close();
		
		System.out.printf("Valor a pagar: %.2f%n", numPecas1 * vlrPorPecas1 + numPecas2 * vlrPorPecas2);
	}
}