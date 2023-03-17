package ejemploUd4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numHijos;
		Trabajador t= new Trabajador ("Ángel", "Jefatura de estudios");
		Consultor c = new Consultor ("Rafa", "Junior", 20, 100);
		Empleado e= new Empleado("Luismi", "Master and comander", 2000, 15);
		System.out.println("Digame el numero de hijos que tiene");
		numHijos=Leer.datoInt();
		System.out.println(t.calcularPaga(numHijos));
		System.out.println(c.calcularPaga(numHijos));
		System.out.println(e.calcularPaga(numHijos));
		
		
	}

}
