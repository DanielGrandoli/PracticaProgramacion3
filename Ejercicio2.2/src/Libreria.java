import java.util.Date;

public class Libreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Editorial e = new Editorial("Alamo","4354584","Los Ceibos 245","Parana","Editorial@gmail.com","21-258-354");	
		Autor a = new Autor("Juan","Fernandez","25/03/1982",'m',"JuanF@gmail.com");
		Libro l = new Libro("Lo que el viento se llevo",a,e,"15/05/2000",10,4000.41,1235468);
		
		System.out.println("La libreria compro: "+ l.getCantidadEjemplar()+" libros de " + l.getNombre()+"\ndel autor: "+l.getAutor().getNombre()+" de la editorial "+l.getEditorial().getNombre());
	}

}
