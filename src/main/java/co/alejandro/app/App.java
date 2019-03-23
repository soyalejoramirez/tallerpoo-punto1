package co.alejandro.app;

import java.util.Arrays;

import co.alejandro.domain.Asignatura;
import co.alejandro.domain.Docente;
import co.alejandro.domain.Estudiante;
import co.alejandro.domain.Nota;

public class App {

	public static void main(String[] args) {
		Docente profesor = new  Docente("123", "Alejandro");

		Asignatura poo = new Asignatura();
		poo.setNombre("POO");
		poo.setNroCreditos(1);
		poo.setDocente(profesor);
		
		Estudiante mateo = new Estudiante("45673", "Mateo");
		Estudiante jhontan = new Estudiante("77654", "Jhonatan");
		Estudiante pablo = new Estudiante("334532", "Pablo");
		Estudiante brayan = new Estudiante("1235642", "Brayan");
		
		Nota notaMateo = new Nota(poo);
		notaMateo.setParcial(4);
		notaMateo.setFinal_(2.3);
		notaMateo.setNotasSeguimiento(Arrays.asList(1.0, 5.0, 4.2, 3.1, 2.8));
		mateo.setNota(notaMateo);
		
		Nota notaJhonatan = new Nota(poo);
		notaJhonatan.setParcial(2.6);
		notaJhonatan.setFinal_(4.3);
		notaJhonatan.setNotasSeguimiento(Arrays.asList(1.9, 3.0, 2.2, 4.1, 4.8));
		jhontan.setNota(notaJhonatan);
		
		Nota notaPablo = new Nota(poo);
		notaPablo.setParcial(2);
		notaPablo.setFinal_(1.3);
		notaPablo.setNotasSeguimiento(Arrays.asList(4.0, 3.2, 2.2, 5.0, 1.8));
		pablo.setNota(notaPablo);
		
		Nota notaBrayan = new Nota(poo);
		notaBrayan.setParcial(5);
		notaBrayan.setFinal_(1);
		notaBrayan.setNotasSeguimiento(Arrays.asList(2.3, 3.0, 4.1, 3.9, 4.8));
		brayan.setNota(notaBrayan);
		
		poo.setEstudiantes(Arrays.asList(mateo, pablo, brayan, jhontan));
		
		for (Estudiante estudiante: poo.getEstudiantes()) {
			System.out.println("El estudiante " + estudiante.getNombre());
			
			double definitiva = estudiante.getNota().calcularDefinitiva();

			System.out.println("Su definitiva es " + definitiva);
			
			if (definitiva >= 3) {
				System.out.println(estudiante.getNombre() + " GANÓ " + poo.getNombre() + "\n");
			} else {
				System.out.println(estudiante.getNombre() + " PERDIÓ " + poo.getNombre() + " :(\n");
			}
			
		}
	}
}






