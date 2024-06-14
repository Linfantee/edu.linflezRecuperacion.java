package servicios;

import controladores.Inicio;

/**
 * implementacion que contienen los métodos de la operativa
 * leig - 140624
 */
public class OperativaImplementacion implements OperativaInterfaz{

	
private long  autoId() {
		
		int tamanioLista=Inicio.listaVehiculo.size();
		long id;
		
		if(tamanioLista>100) {
			
			id=Inicio.listaVehiculo.get(tamanioLista - 1).getId()-1;
		}else {
			
			id=100;
		}
		
		return id;
	}
}

