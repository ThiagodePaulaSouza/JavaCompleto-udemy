import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		System.out.println("a soma e: " + soma(x,y));
	}
	
	public static int soma(int x, int y) {
		return x+y;
	}
}
