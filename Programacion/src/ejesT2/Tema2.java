package ejesT2;

import java.util.Scanner;

public class Tema2 {
	
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		ej34();
		ej31();
		ej33();
	

	}
	
	private static void ej31() {
		System.out.println("Ejercico 3.1: ");
		System.out.println("Introduce un numero de 3 cifras: ");
		String numero=sc.next();
		for (int i = 0; i < numero.length(); i++) {
			
			System.out.println(numero.charAt(i));
		}
		
	}
	private static void ej33() {
		System.out.println("Ejercico 3.3: ");
		System.out.println("Introduce el numero de ecos a realizar: ");
		int numero=sc.nextInt();
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Eco....");
		}
	}
	private static void ej34() {
		System.out.println("Ejercico 3.4: ");
		System.out.println("Introduce un numero para saber su raiz cuadrada: ");
		int numero=sc.nextInt();
		int raiz=(int) Math.sqrt(numero);
		int resto=numero-(raiz*raiz);
		if (resto==0) {
			System.out.println("La raiz cuadrada de "+numero+" es "+raiz+" y su resto es exacto: "+ resto+".");
		
		}
		if (resto !=0) {
			System.out.println("La raiz cuadrada de "+numero+" es "+raiz+" y su resto no es exacto: "+ resto+".");
		}
		
		
	
		
	}
}
