package co.alejandro.domain;

import java.util.List;

public class Nota {
	private double parcial;
	private double final_;
	private List<Double> notasSeguimiento;
	private Asignatura materia;
	
	public Nota(Asignatura materia) {
		this.materia = materia;
	}
	
	public double calcularDefinitiva() {
		double notaParcial = this.parcial * 0.3;
		double notaFinal = this.final_ * 0.3;
		double notaSeguimiento = calcularSeguimiento() * 0.4;
		
		return notaParcial + notaFinal + notaSeguimiento;
	}
	
	private double calcularSeguimiento() {
		double suma = 0;
		
		for (Double nota : notasSeguimiento) {
			suma += nota;
		}
		
		return suma / notasSeguimiento.size();
	}

	public double getParcial() {
		return parcial;
	}

	public void setParcial(double parcial) {
		this.parcial = parcial;
	}

	public double getFinal_() {
		return final_;
	}

	public void setFinal_(double final_) {
		this.final_ = final_;
	}

	public List<Double> getNotasSeguimiento() {
		return notasSeguimiento;
	}

	public void setNotasSeguimiento(List<Double> notasSeguimiento) {
		this.notasSeguimiento = notasSeguimiento;
	}

	public Asignatura getMateria() {
		return materia;
	}
}