
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int edad = 0;
		int experiencia = 0;
		int remuneracionPretendida = 0;
		
		String apellidoNombre = "Pablo Mateu";
		
		System.out.println("Ingresar Apellido y Nombre: ");
		apellidoNombre = scan.nextLine();
		System.out.println("Ingresar Edad: ");
		edad = scan.nextInt();
		System.out.println("Años de experencia: ");
		experiencia = scan.nextInt();
		System.out.println("Remuneración pretendida: ");
		remuneracionPretendida = scan.nextInt();
		
		System.out.println("Solicitud enviada...\n");
		
		if(edad >= 18 || edad <= 35) {
			if(edad > 32){
				if(experiencia >= 6) {
					System.out.println("Solicitud aceptada");
				}else if(experiencia > 3) {
					System.out.println("Se lo toma de manera condicional");
				}else {
					System.out.println("Solicitud rechazada");
				}
			}else if((experiencia < 3)) {
					if(remuneracionPretendida < 50000) {
						System.out.println("Solicitudd aceptada");
					}else {
						System.out.println("Solicitud rechazada");
					}
			}else {
				System.out.println("Solicitud aceptada");
			}
		}else {
			System.out.println("Su solicitud fue rechazada");
		}
		
	}

	}

