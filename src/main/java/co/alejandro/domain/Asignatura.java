package co.alejandro.domain;

import java.util.List;

public class Asignatura {
	private String nombre;
	private int nroCreditos;
	private Docente docente;
	private List<Estudiante> estudiantes;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroCreditos() {
		return nroCreditos;
	}
	public void setNroCreditos(int nroCreditos) {
		this.nroCreditos = nroCreditos;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
}
