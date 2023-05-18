import java.util.Date;

public class Libro {
String nombre;
Autor autor;
Editorial editorial;
String publicacion;
int cantidadEjemplar;
double costo;
int ISDN;
public Libro(String nombre, Autor autor, Editorial editorial, String publicacion, int cantidadEjemplar, double costo,
		int iSDN) {
	super();
	this.nombre = nombre;
	this.autor = autor;
	this.editorial = editorial;
	this.publicacion = publicacion;
	this.cantidadEjemplar = cantidadEjemplar;
	this.costo = costo;
	ISDN = iSDN;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Autor getAutor() {
	return autor;
}
public void setAutor(Autor autor) {
	this.autor = autor;
}
public Editorial getEditorial() {
	return editorial;
}
public void setEditorial(Editorial editorial) {
	this.editorial = editorial;
}

public String getPublicacion() {
	return publicacion;
}
public void setPublicacion(String publicacion) {
	this.publicacion = publicacion;
}
public int getCantidadEjemplar() {
	return cantidadEjemplar;
}
public void setCantidadEjemplar(int cantidadEjemplar) {
	this.cantidadEjemplar = cantidadEjemplar;
}
public double getCosto() {
	return costo;
}
public void setCosto(double costo) {
	this.costo = costo;
}
public int getISDN() {
	return ISDN;
}
public void setISDN(int iSDN) {
	ISDN = iSDN;
}





}
