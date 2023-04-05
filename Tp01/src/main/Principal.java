package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import algoritmos.OrdenadorAlumnos;
import algoritmos.OrdenadorPromedios;
import algoritmos.OrdenarProfesor;
import algoritmos.OrdenarProfesorEdad;
import model.Alumno;
import model.Persona;
import model.Profesor;

public class Principal {

	public static void main(String[] args) {
		ListaPersonas personas = new ListaPersonas();
		personas.generateAlumnosYProfesores();

		List<Persona> lista = personas.getPersonas();
		List<Alumno> listaAlumnos = new ArrayList<>();
		List<Profesor> listaProfesores = new ArrayList<>();

		for (Persona p : lista) {
			if (p instanceof Alumno) {
				listaAlumnos.add((Alumno) p);
			} else {
				listaProfesores.add((Profesor) p);
			}
		}

		Collections.sort(listaAlumnos, new OrdenadorAlumnos());
		System.out.println("-------------------------");
		System.out.println("Punto A:");
		System.out.println("-------------------------");
		System.out.println("\tOrdenar por Apellido y Nombre los Alumnos\n");
		
		for (Persona o : listaAlumnos) {
			System.out.println(o.getApellido() + ", " + o.getNombre());
		}

		System.out.println("-------------------------");

		Collections.sort(listaProfesores, new OrdenarProfesor());
		System.out.println("Punto B:");
		System.out.println("-------------------------");
		System.out.println("\tOrdenar por Apellido y Nombre los Profesores\n");
		for (Persona o : listaProfesores) {
			System.out.println(o.getApellido() + ", " + o.getNombre());
		}

		System.out.println("-------------------------");

		Collections.sort(listaAlumnos, new OrdenadorPromedios());
		System.out.println("Punto C");
		System.out.println("-------------------------");
		System.out.println("El promedio mas alto es :" + listaAlumnos.get(0).getPromedio()+"\n");

		System.out.println("-------------------------");
		System.out.println("Punto D");
		System.out.println("-------------------------");
		System.out.println("El promedio mas bajo es :" + listaAlumnos.get(listaAlumnos.size() - 1).getPromedio()+"\n");

		System.out.println("-------------------------");
		System.out.println("Punto E");
		System.out.println("-------------------------");
		System.out.println("Promedio mayor a 7\n");
		System.out.println("-------------------------");
		for (Alumno a : listaAlumnos) {
			if (a.getPromedio() > 7)
				System.out.println(a.getApellido() + ", " + a.getNombre() + " Prom: " + a.getPromedio());
		}
		System.out.println("-------------------------");
		System.out.println("\tLista completa de promedios\n");
		
		for (Alumno a : listaAlumnos) {
				System.out.println(a.getApellido() + ", " + a.getNombre() + " Prom: " + a.getPromedio());
		}

		System.out.println("-------------------------");
		System.out.println("Punto F");
		System.out.println("-------------------------");
		System.out.println("\tIngenieros en sistema\n");
		for (Profesor p : listaProfesores) {
			
			if (p.getTitulo()=="Ing. en Sistemas")
			{
				System.out.println(p.getApellido() + ", " + p.getNombre() + " Titulo: " + p.getTitulo());
			}
		}
		
		
		System.out.println("-------------------------");
		System.out.println("Punto G:");
		System.out.println("-------------------------");
		System.out.println("\tOrdenar por Edad los Profesores\n");
		Collections.sort(listaProfesores,new OrdenarProfesorEdad());
		for (Persona o : listaProfesores) {
			System.out.println(o.getApellido() + ", " + o.getNombre()+ ", Edad:"+ o.getEdad());
		}


	}
}
