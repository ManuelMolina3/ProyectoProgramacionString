package ejercicio2;

public class Operaciones {

	//atributos
	//en este ejercicio no hay atributos
	//constructores
	public Operaciones () {
		
	}
	//metodos
	public boolean comproPos (int num) {
		int tope=0;
		if (num>=tope) {
			return true;
		}else {
			return false;
		}
	}
	public void imprimir (boolean b) {
		if (b) {
			System.out.println("Positivo");
			
		}else {
			System.out.println("Negativo");
		}
	}
	
}
