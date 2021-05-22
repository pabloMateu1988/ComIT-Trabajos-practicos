import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean salir = true;
		imprimirMenu();
		while(salir) {
			switch (menu(scan)) {
			case 1:
				circulo(scan);
				imprimirOpcion();
				break;
			case 2:
				cuadrado(scan);
				imprimirOpcion();
				break;
			case 3:
				rectangulo(scan);
				imprimirOpcion();
				break;
			case 4:
				triangulo(scan);
				imprimirOpcion();
				break;
			case 5:
				trapecio(scan);
				imprimirOpcion();
				break;
			case 6:
				salir = false;
				break;
			}
			
			
		}
		System.out.println("-----El programa ha finalizado-----");
		
		
		

	}
	private static void imprimirOpcion() {
		System.out.println("\nOprimir la opcion que desea: ");
	}
	private static void imprimirMenu() {
		System.out.println("\n********************************************");
		System.out.println("\t\t  MENU\t\t\t");
		System.out.println("********************************************");
		System.out.println("1 - Calcular area del Circulo");
		System.out.println("--------------------------------------------");
		System.out.println("2 - Calcular area del Cuadrado");
		System.out.println("--------------------------------------------");
		System.out.println("3 - Calcular area del Rectangulo");
		System.out.println("--------------------------------------------");
		System.out.println("4 - Calcular area del Triangulo");
		System.out.println("--------------------------------------------");
		System.out.println("5 - Calcular area del Trapecio");
		System.out.println("--------------------------------------------");
		System.out.println("6 - Salir");
		System.out.println("--------------------------------------------");
		System.out.println("Oprimir la opcion que desea: \n");
		System.out.println("********************************************");
	}

	private static int menu(Scanner scan) {
		int seleccion = 0;
		seleccion = scan.nextInt();
		return seleccion;
	}

	private static void trapecio(Scanner scan) {
		System.out.println("Ingresar base menor: ");
		double baseMenor = scan.nextDouble();
		System.out.println("Ingresar base mayor: ");
		double baseMayor = scan.nextDouble();
		System.out.println("Ingresar altura: ");
		double altura = scan.nextDouble();
		double area = ((altura * (baseMayor * baseMenor))/2);
		System.out.println("El area del trapecio es de: " + area + "\n");
		
	}

	private static void triangulo(Scanner scan) {
		double area = (baseporaltura(scan) / 2);
		System.out.println("El area del cuadrado es de: "+ area + "\n");
	}

	private static double baseporaltura(Scanner scan) {
		System.out.println("Ingresar base: ");
		double base = scan.nextDouble();
		System.out.println("Ingresar altura: ");
		double altura = scan.nextDouble();
		double area = (base * altura);
		return area;
	}

	private static void rectangulo(Scanner scan) {
		System.out.println("El area del cuadrado es de: "+ baseporaltura(scan));
	}

	private static void circulo(Scanner scan) {
		final double PI = 3.14;
		System.out.println("Ingresar Radio: ");
		double radio = scan.nextDouble();
		double area = (PI * (radio * radio));
		System.out.println("El area del cuadrado es de: "+ area + "\n");
	}

	private static void cuadrado(Scanner scan) {
		System.out.println("Ingresar valor del lado: ");
		double lado = scan.nextDouble();
		double area = (lado * lado);
		System.out.println("El area del cuadrado es de: "+ area + "\n");
	}

}

