import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//entrada
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();		
		sc.close();
		
		//processamento
		double triangulo = (A * C) / 2;
		double circulo = (C * C) * Math.PI;
		double trapezio = ((A + B) * C) /2;
		double quadrado = B * B;
		double retangulo = A * B;
		
		//saida
		System.out.printf("Triangulo: %.3f%n",triangulo);
		System.out.printf("Circulo: %.3f%n",circulo);
		System.out.printf("Trapezio: %.3f%n",trapezio);
		System.out.printf("Quadrado: %.3f%n",quadrado);
		System.out.printf("Retangulo: %.3f%n",retangulo);
	}
}