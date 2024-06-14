package servicios;

import java.util.Scanner;

/**
 * Implementación donde se encuentra el método de la interfaz de menú.
 * 
 */
public class MenuImplementacion implements MenuInterfaz {

	
	public int mostrarMenuYSeleccion(Scanner sc) {
		
		int opcion;
		
		System.out.println("0. Cerrar Menú.");
		System.out.println("1. Venta de vehículo.");
		opcion = sc.nextInt();
		
		return opcion;
		
		
		
		
	}
	
}
