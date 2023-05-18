import java.util.ArrayList;

public class Curso {
String nombre;
Profesor p;
ArrayList<Alumno> alumnos= new ArrayList<Alumno>();
public Curso(String nombre, Profesor p, ArrayList<Alumno> alumnos) {
	super();
	this.nombre = nombre;
	this.p = p;
	this.alumnos = alumnos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Profesor getP() {
	return p;
}
public void setP(Profesor p) {
	this.p = p;
}
public ArrayList<Alumno> getAlumnos() {
	return alumnos;
}
public void setAlumnos(ArrayList<Alumno> alumnos) {
	this.alumnos = alumnos;
}
@Override
public String toString() {
	return "Curso [nombre=" + nombre + ", p=" + p + ", alumnos=" + alumnos + "]";
}



}
