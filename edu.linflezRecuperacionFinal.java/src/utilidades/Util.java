package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Método que crea el nombre del fichero en el formato que queremos.
 * leig - 140624
 */
public class Util {

	
	public static String crearNombreLog() {
				
			
           LocalDate fecha = LocalDate.now();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
			String fechaConvertida = fecha.format(formato);
			String fechaTotal = "Log-".concat(fechaConvertida).concat(".txt");
			
			return fechaTotal;
	
			
		
		
	}
	
	
}