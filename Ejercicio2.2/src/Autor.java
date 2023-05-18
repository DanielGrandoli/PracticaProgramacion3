import java.util.Date;

public class Autor {
String nombre;
String apellido;
String fechaNacim;
char sexo;
String email;
public Autor(String nombre, String apellido, String fechaNacim, char sexo, String email) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacim = fechaNacim;
	this.sexo = sexo;
	this.email = email;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getFechaNacim() {
	return fechaNacim;
}
public void setFechaNacim(String fechaNacim) {
	this.fechaNacim = fechaNacim;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
