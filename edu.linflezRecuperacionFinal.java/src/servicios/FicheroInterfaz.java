package servicios;

/**
 * Interfaz que contiene la cabecera de los métodos del fichero.
 * leig - 140624
 */
public interface FicheroInterfaz {

	/**
	 * Método que lee el fichero log y lo muestra.
	 * leig - 140624
	 * @param mensaje
	 */
	public void leerFicheroLog(String mensaje);
	
	/**
	 * Método que carga los datos sin que el usuario lo vea.
	 * leig - 140624
	 */
	public void cargaInicial();
	
}
