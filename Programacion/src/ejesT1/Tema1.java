package ejesT1;

import java.util.Scanner;

public class Tema1 {
	static Scanner sc=new Scanner(System.in);
	public Tema1() {
		// TODO Auto-generated constructor stub
	}

	public static void Iva1(){
		System.out.println("Introduzca cantidad para calcular el IVA: ");
		System.out.println();
		int bruto=sc.nextInt();
		System.out.println("Introduzca IVA: ");
		double iva=sc.nextDouble();
		double total=(bruto-(iva/100)*bruto);
		System.out.println("La cantidad sin iva es: "+ total);
		eleccion();
	}

	public static void triangulo2() {
		//a=(b*h)/2
		System.out.println("Introduce la base: ");

		int base=sc.nextInt();

		System.out.println("Introduce la altura: ");
		//altura
		int H=sc.nextInt();

		int total=((base*H)/2);

		System.out.println("El area es: "+ total);
		eleccion();
	}


	public static void polimomio() {
		double total;
		// y=ax*x
		//no me acuerdo de estas formulas ya... 
		double a, x, b, c;
		System.out.println("Introduce coeficientes de a, b , c y x");
		System.out.println("a: ");
		a=sc.nextInt();
		System.out.println("b: ");
		b=sc.nextInt();
		System.out.println("c: ");
		c=sc.nextInt();
		System.out.println("x: ");
		x=sc.nextInt();
		double z=a*x;
		total=((Math.pow(z , 2))+(b *x)+c);
		System.out.println("El valor resultante es: "+ total);
		eleccion();
	}

	public static void segundos() {
		System.out.println("Introducir tiempo en segundos: ");
		int seg=sc.nextInt();
		int horas, minutos, segundos;
		minutos=seg/60;
		horas=minutos/60;
		segundos=seg;



		System.out.println("Son "+horas+", "+minutos+" y "+segundos+". ");
		eleccion();
	}

	public static void distancias() {
		System.out.println("Introduzca 3 distancias a sumar.");
		System.out.println("Distancia 1 en milimetros: ");
		int mili=sc.nextInt();
		System.out.println("Distancia 2  en centimetros: ");
		int cent=sc.nextInt();
		System.out.println("Distancia 3 en metros: ");
		int metr=sc.nextInt();
		mili=mili*100;
		metr=metr/100;
		int total= mili+cent+metr;
		System.out.println("La suma es "+total+" centimetros.");

		eleccion();
	}

	public static void patas() {
		System.out.println("¿Que numero animales has capturado hoy?");
		System.out.println("Nº de hormigas: ");
		int num=sc.nextInt();
		int Thormigas=6*num;
		System.out.println("Nº de arañas: ");
		num=sc.nextInt();
		int Taranyas=num*8;
		System.out.println("Nº de cochinillas: ");
		num=sc.nextInt();
		int Tcochinillas=num*14;
		int total=Thormigas+Taranyas+Tcochinillas;
		System.out.println("El numero total de patitas es: "+total);
		System.out.println("El numero de patas de hormigas es :"+Thormigas);
		System.out.println("El numero de patas de arañas es: "+Taranyas);
		System.out.println("El numero de patas de cochinillas es: "+Tcochinillas);
		eleccion();
	}
	public static void eleccion() {
		System.out.println();
		System.out.println();
		System.out.println("Elije el ejercicio a mostrar.");
		System.out.println("1º Iva");
		System.out.println("2º Triangulo");
		System.out.println("3º Polinomio");
		System.out.println("4º segundos");
		System.out.println("5º distancias");
		System.out.println("6º patas");
		System.out.println("7º cerrar programa");
		System.out.println();
		
		int opcion=sc.nextInt();
		
		switch (opcion) {
		case 1:
			Iva1();
			break;
		case 2:
			triangulo2();
			break;
		case 3:
			polimomio();
			break;
		case 4:
			segundos();
			break;
		case 5:
			distancias();
			break;
		case 6:
			patas();
			break;
		case 7:
			System.out.println("Hasta pronto..... :D ");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		eleccion();
	}

}
