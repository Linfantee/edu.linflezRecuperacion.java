package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase principal de la aplicación.
 * leig - 140624
 */
public class Inicio {
/**
 * Aqui se encuentran todos los métodos de nuestra aplicación junto con los estaticos.
 * leig - 140624
 */
	public static final String rutaRaizLogs = "C:\\Users\\csi23-linflez\\recuperacion-java-workspace\\edu.linflezRecuperacionFinal.java\\src\\Logs\\".concat(utilidades.Util.crearNombreLog());
	public static List<VehiculoDto> listaVehiculo = new ArrayList<VehiculoDto>();
	public static List<PropietarioDto> listaPropietario = new ArrayList<PropietarioDto>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();

		int eleccion;
		boolean cerrarMenu = true;

		do {

			eleccion = mi.mostrarMenuYSeleccion(sc);
			try {
				switch (eleccion) {
				case 0:
					System.out.println("Se ha cerrado el menú.");
					cerrarMenu = false;
					fi.leerFicheroLog(rutaRaizLogs);
					break;
				case 1:
					System.out.println("Vender vehículo.");
					fi.leerFicheroLog(rutaRaizLogs);
					break;
				default:
					System.out.println("La opcion intriducida no existe, escoja otra.");
					break;
				}
			} catch (Exception e) {

				fi.leerFicheroLog(rutaRaizLogs);
			}
		} while (cerrarMenu);

	}

}
