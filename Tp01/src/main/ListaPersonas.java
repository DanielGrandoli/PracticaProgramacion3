package main;

import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import model.Persona;
import model.Profesor;

public class ListaPersonas {

	private List<Persona> personas;
	
	public ListaPersonas() {
		this.personas = new ArrayList<>();
	}

	public void generateAlumnosYProfesores() {
		// 1
		Alumno a1 = new Alumno("Garcia","Elvira",24,'F');
		a1.setNroLE("45698");
		a1.setMateriasAprobadas(10);
		a1.setPromedio(7.26);
		this.personas.add(a1);
		
		// 2
		Alumno a2 = new Alumno("Beltramino","Fabricio",22,'M');
		a2.setNroLE("45690");
		a2.setMateriasAprobadas(8);
		a2.setPromedio(5.26);
		this.personas.add(a2);
		
		// 3
		Alumno a3 = new Alumno("Beltramino","Laura",23,'F');
		a3.setNroLE("45691");
		a3.setMateriasAprobadas(12);
		a3.setPromedio(9.26);
		this.personas.add(a3);
		
		Profesor p1= new Profesor("Carpio","Mariano",46,'M');
		p1.setLegajo("58850");
		p1.setTitulo("Ing. en Sistemas");
		this.personas.add(p1);
		
		Profesor p2= new Profesor("Jozami","Jose",44,'M');
		p2.setLegajo("58550");
		p2.setTitulo("Ing. en Electromecanica");
		this.personas.add(p2);
		
		Profesor p3= new Profesor("Fernandez","Estefania",48,'F');
		p3.setLegajo("58450");
		p3.setTitulo("Ing. en Sistemas");
		this.personas.add(p3);
		
		Profesor p4= new Profesor("Fernandez","Laura",42,'F');
		p4.setLegajo("58150");
		p4.setTitulo("Ing. en Electronica");
		this.personas.add(p4);
		
	}
	
	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	
}
