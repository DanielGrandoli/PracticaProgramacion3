package model;

public class Alumno extends Persona {

	private String nroLE;
	private int materiasAprobadas;
	private double promedio;
	
	public Alumno(String apellido, String nombre, int edad, char sexo) {
		super(apellido, nombre, edad, sexo);
		// TODO Auto-generated constructor stub
		
	}
	
	public String getNroLE() {
		return nroLE;
	}

	public void setNroLE(String nroLE) {
		this.nroLE = nroLE;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	

}
