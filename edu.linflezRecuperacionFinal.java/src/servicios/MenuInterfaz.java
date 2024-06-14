package servicios;

import java.util.Scanner;

/**
 * Interfaz que contine la cabeceras del menú.
 * 
 */
public interface MenuInterfaz {

	/**
	 * 
	 * Método que muestra el menú y la selección.
	 * @param sc
	 * @return
	 */
	
	public int mostrarMenuYSeleccion(Scanner sc);
}
