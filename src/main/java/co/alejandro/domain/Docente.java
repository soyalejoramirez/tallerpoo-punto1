package co.alejandro.domain;

public class Docente {
	private String identificacion;
	private String nombre;
	private int edad;

	public Docente(String identificacion, String nombre) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getIdentificacion() {
		return identificacion;
	}
}
