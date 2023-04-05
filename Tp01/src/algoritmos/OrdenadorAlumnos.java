package algoritmos;

import java.util.Comparator;

import model.Alumno;

public class OrdenadorAlumnos implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int a = o1.getApellido().compareTo(o2.getApellido());
		if(a != 0) {
			return a;
		} else {
			return o1.getNombre().compareTo(o2.getNombre());
		}
	}

}
