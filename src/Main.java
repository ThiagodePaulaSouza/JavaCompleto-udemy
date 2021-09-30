import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 0;
		double raio = 0;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		
		raio = Math.PI * Math.pow(x, 2);
		System.out.printf("o raio e: %.4f%n", raio);
		
		
		
		
		sc.close();
	}
}