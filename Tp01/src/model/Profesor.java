package model;

public class Profesor extends Persona {

	private String legajo;
	private String titulo;	
	
	public Profesor(String apellido, String nombre, int edad, char sexo) {
		super(apellido, nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}
