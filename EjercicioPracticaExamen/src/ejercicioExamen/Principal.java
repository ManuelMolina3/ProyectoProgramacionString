package ejercicioExamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto produc;
		String nombre = "", seccion = "";
		double precioBase = 0.00, libras = 0.00, pvp = 0;
		int ganancia = 0, rebajas = 0;
		System.out.println("**********************");
		System.out.println("JUGUETES TURIA");
		System.out.println("**********************");
		System.out.println("Bienvenido a juguetes turia dime que producto vas a introducir");
		nombre = Leer.dato();
		System.out.println("Digame en que sección lo va a meter");
		seccion = Leer.dato();
		System.out.printf("Digame el precio base del %S", nombre);
		precioBase = Leer.datoDouble();
		System.out.println("Si quiere hacerle rebajas a su producto digame que porcentaje le quiere hacer");
		rebajas = Leer.datoInt();
		produc = new Producto(nombre, precioBase, seccion, rebajas);
		System.out.println("");
	}

}
