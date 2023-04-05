package model;

public abstract class Persona {
	private int id;
	private String apellido;
	private String nombre;
	private int edad;
	private char sexo;
	private String dni;
	
	Persona(String apellido, String nombre, int edad, char sexo){
		this.id=0;
		this.apellido=apellido;
		this.nombre=nombre;
		this.dni="99.999.999";
		this.edad=edad;
		this.sexo=sexo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
