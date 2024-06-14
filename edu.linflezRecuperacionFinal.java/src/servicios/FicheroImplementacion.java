package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.PropietarioDto;
import dtos.VehiculoDto;
/**
 * Implementación de los métodos del fichero
 * leig - 140624
 */
public class FicheroImplementacion implements FicheroInterfaz{
	
	public void leerFicheroLog(String mensaje){
		
		
		try {
			
			FileWriter fw = new FileWriter(Inicio.rutaRaizLogs, true);
			fw.write(mensaje + "\n");
			fw.close();
			
		}catch (Exception e) {
			System.out.println("Se ha detectado un error al leer en el fichero, vuelva mas tarde.");
			
		}
		
		
		
	}
	
	@Override
	public void cargaInicial() {
		
		try {
			FileReader lector = new FileReader("C:\\Users\\csi23-linflez\\recuperacion-java-workspace\\edu.linflezRecuperacionFinal.java\\src\\CargaInicial\\".concat("vehiculosYpropietarios.txt"));
			BufferedReader bf = new BufferedReader(lector);
			String linea;
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			while((linea = bf.readLine()) != null) {
				String[] coche = linea.split(":");
				String[] propietario = linea.split(":");
				VehiculoDto car = new VehiculoDto();
				PropietarioDto duenio = new PropietarioDto();
				car.setMatricula(coche[0]);
				car.setFchMatriculacion(LocalDate.parse(coche[1],formato));
				duenio.setDni(propietario[2]);
				duenio.setFchCompra(LocalDate.parse(propietario[3],formato));
				
				Inicio.listaVehiculo.add(car);
				Inicio.listaPropietario.add(duenio);
				
			}
			
			lector.close();
			bf.close();
		}catch(Exception e) {
		}
		
	}

}
