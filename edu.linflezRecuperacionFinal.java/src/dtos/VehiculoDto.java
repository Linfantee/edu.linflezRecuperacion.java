package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VehiculoDto {

	int id;
	String matricula;
	LocalDate fchMatriculacion = LocalDate.now();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDate getFchMatriculacion() {
		return fchMatriculacion;
	}
	public void setFchMatriculacion(LocalDate localDate) {
		this.fchMatriculacion = localDate;
	}
	
}
