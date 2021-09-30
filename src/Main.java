import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int hrsTrab = sc.nextInt();
		double qtdRecebePorHora = sc.nextDouble();
		sc.close();
		
		double salario = hrsTrab * qtdRecebePorHora;
		
		System.out.println("Number = " + num);
		System.out.printf("Salary = U$ %.2f%n", salario);
	}
}