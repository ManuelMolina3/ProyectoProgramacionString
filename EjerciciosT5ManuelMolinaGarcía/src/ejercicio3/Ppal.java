package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1= new Alumno ("12345678A", "Ángel", "Naranjo González", 46, 5.6);
		Alumno a2= new Alumno ("87654321B", "Miguel", "Campos Rivera", 34, 8.6);
		Set <Alumno> lista = new HashSet<Alumno>();
		
		lista.add(a1);
		lista.add(a2);
		
		Aula a = new Aula ("1DAM", lista);
		
		a.mostaraTodos();
	}

}
