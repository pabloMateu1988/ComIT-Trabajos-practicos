
public class MainApp {

	public static void main(String[] args) {
		double sumarNotas=0;
		double promedio=0;
		String [] apellidosAlumnos = new String[] {"Messi","Mascherano","Aimar","Fernandez","Romero","Maradona","Messera","Riquelme","Troglio", "Palermo"
				
		};
		
		String [] nombresAlumnos = new String[] {"Leonel","Javier","Pablo","Juan","Sergio","Diego","Mariano","Juan Roman","Pedro", "Martin"
				
		};
		
		int cantAlumnos = apellidosAlumnos.length;
		
		int notas[] = new int[cantAlumnos];
		
		cargarNotas(apellidosAlumnos, notas);
		
		sumarNotas = sumarNotas(sumarNotas, notas);
		
		imprimirLista(apellidosAlumnos, notas);
		
		promedio = (sumarNotas/cantAlumnos);
		
		System.out.println("\nEl promedio de las notas es de: " + promedio);
		
		alumnosQueSuperanPromedio(promedio, apellidosAlumnos, nombresAlumnos, notas);
		
		
		
		
		
		
		

	}

	private static double sumarNotas(double sumarNotas, int[] notas) {
		for (int i = 0; i < notas.length; i++) {
			sumarNotas= (sumarNotas + notas[i]);
		}
		return sumarNotas;
	}

	private static void alumnosQueSuperanPromedio(double promedio, String[] apellidosAlumnos, String[] nombresAlumnos,
			int[] notas) {
		System.out.println("\nLos siguientes alumnos superan el promedio:\n ");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > promedio) {
				System.out.println("\n " + apellidosAlumnos[i] + ", " + nombresAlumnos[i]);
			}
		}
	}

	private static void imprimirLista(String[] alumnos, int[] notas) {
		System.out.print("\tApellido\t\tNota\n");
		System.out.println("_____________________________________________________");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(String.format("%16.16s \t\t  %2.2s", alumnos[i], notas[i]));
		}
	}

	private static void cargarNotas( String[] alumnos, int[] notas) {
		for (int i = 0; i < alumnos.length; i++) {
				notas[i] = (int)(Math.random()*10+1);
		}
	}

}
