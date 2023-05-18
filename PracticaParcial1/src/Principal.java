import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		Alumno a=new Alumno("Fernando","Daniel",38054313);
		
		alumnos.add(a);
		
		Curso c = new Curso("Matematicas",new Profesor("Carlos",1135),alumnos);
		
		System.out.println(c.toString());
	}

}
