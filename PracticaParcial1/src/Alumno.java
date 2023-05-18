
public class Alumno {
String nombre;
String Apellido;
Integer NroDni;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public Integer getNroDni() {
	return NroDni;
}
public void setNroDni(Integer nroDni) {
	NroDni = nroDni;
}
public Alumno(String nombre, String apellido, Integer nroDni) {
	super();
	this.nombre = nombre;
	Apellido = apellido;
	NroDni = nroDni;
}
@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", Apellido=" + Apellido + ", NroDni=" + NroDni + "]";
}

}
