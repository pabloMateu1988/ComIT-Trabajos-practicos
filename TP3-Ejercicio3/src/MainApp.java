import java.text.DecimalFormat;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double impuesto = 0;
		double patente = 0;
		double valorFiscal = 0;
		double cantidadDePatentes = 0;
		double montoTotal = 0;
		double porcentajeAutos = 0;
		double cont = 0;
		
		String mensaje = "" ;
		DecimalFormat formateador = new DecimalFormat("####.##");
		
		System.out.println("Ingresar cantidad de patentes a procesar: ");
		cantidadDePatentes = scan.nextInt();
		for (int i = 0; i < cantidadDePatentes; i++) {
			System.out.println("Ingresar patente: ");
			patente = scan.nextInt();
			System.out.println("Ingresar valor fiscal del vehiculo: ");
			valorFiscal = scan.nextDouble();
			
			if (patente < 1000) {
				impuesto = ((valorFiscal * 5) / 100);
				
			}else if(patente >= 1000 && patente <= 2000){
					impuesto = ((valorFiscal * 10) / 100);
					}else {
						impuesto = ((valorFiscal * 15) / 100);
					}
			if(patente > 1300) {
				cont++;
			}
			
			mensaje += "\nEl impuesto a pagar por el vehiculo con patente " + formateador.format(patente) + " es de $" + formateador.format(impuesto) + "\n";
			montoTotal += impuesto;
			
	
			
		}
		System.out.println(mensaje);
		System.out.println("El monto total recaudado por el impuesto es de $" + formateador.format(montoTotal) + "\n");
		System.out.println("El porcentaje de autos con patentes mayores a 1300 fue de " + (int)((cont / cantidadDePatentes ) * 100) + "%");
		
		

	}

}

