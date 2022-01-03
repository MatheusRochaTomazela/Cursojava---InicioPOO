package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Informe os valores do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe os valores do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
				

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A area do triangulo X é: %.4f%n" , areaX);
		System.out.printf("A area do triangulo Y é: %.4f%n" , areaY);
		
		if (areaX > areaY) {
			System.out.printf("O trinagulo X tem a maior area com: %.4f%n" , areaX );
		}
		else
			System.out.printf("O trinagulo Y tem a maior area com: %.4f%n" , areaY );
				
				
				
		sc.close();		
	}

}
