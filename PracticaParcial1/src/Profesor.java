
public class Profesor {
String apellido;
Integer Nrolegajo;
public Profesor(String apellido, Integer nrolegajo) {
	super();
	this.apellido = apellido;
	Nrolegajo = nrolegajo;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Integer getNrolegajo() {
	return Nrolegajo;
}
public void setNrolegajo(Integer nrolegajo) {
	Nrolegajo = nrolegajo;
}
@Override
public String toString() {
	return "Profesor [apellido=" + apellido + ", Nrolegajo=" + Nrolegajo + "]";
}


}
