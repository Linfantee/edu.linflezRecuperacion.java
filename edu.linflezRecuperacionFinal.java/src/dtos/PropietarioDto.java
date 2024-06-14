package dtos;

import java.time.LocalDate;

public class PropietarioDto {

	int id;
	String dni;
	LocalDate fchCompra = LocalDate.now();
	String matricula;
	String esHistorico;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFchCompra() {
		return fchCompra;
	}

	public void setFchCompra(LocalDate fchCompra) {
		this.fchCompra = fchCompra;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEsHistorico() {
		return esHistorico;
	}

	public void setEsHistorico(String esHistorico) {
		this.esHistorico = esHistorico;
	}

}
