
package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos
		 * debe ser precio de fábrica). En una clase Gestion, con un array de productos
		 * como atributo se podrá: listar datos de todos los productos, calcular el
		 * precio de venta al público, que será el precio de fábrica más un 50
		 * %,comprobar si el producto es “frágil” o no, mediante un método que devuelva
		 * un tipo boolean y añadir un producto a la lista pasando como parámetro un
		 * producto. Crear un main de prueba.
		 */
		int tam, op, ganancia, fragil, contadorP=0;
		String nombre, categoria;
		boolean fragilidad;
		double precioFabri;
		Producto[] producto;
		Gestion gest;
		System.out.println("Bienvenido a el programa que te ayuda a la gestion de tu tienda");
		System.out.println("Digame cuantos productos quiere añadir a su catálogo");
		tam=Leer.datoInt();
		producto= new Producto [tam];
		gest = new Gestion (producto);
		do {
			System.out.println("\nPulse 1 para añadir un producto\n"
					+ "Pulse 2 para ver la lista de productos\n"
					+ "Pulse 3 para ver el precio de venta al publico que tiene sus productos\n"
					+ "Pulse 4 para ver su su producto es fragil o no\n"
					+ "Pulse 5 para buscar un producto por su nombre\n"
					+ "Pulse 0 para salir del programa");
			op=Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Digame el nombre del producto");
					nombre=Leer.dato();
					System.out.println("Digame el precio de fabricación del producto");
					precioFabri=Leer.datoDouble();
					System.out.println("Digame la categoria del producto");
					categoria=Leer.dato();
					System.out.println("Pulse 1 si el producto es fragil o pulse 0 si no lo es");
					fragil=Leer.datoInt();
					if(fragil==1) {
						fragilidad=true;
					}else {
						fragilidad=false;
					}
					System.out.println("digame el porcentaje de ganancia que quiere tener en la venta del producto");
					ganancia=Leer.datoInt();
					gest.add(new Producto (precioFabri, nombre, categoria, fragilidad, ganancia), contadorP );
					contadorP++;
					break;
				case 2:
					gest.listar();
					break;
				case 3:
					
					gest.imprimirPVP(gest.calcularPvp(tam)); 
					
					break;
				case 4:
					//gest.imprimirFragil(gest.comprobarFragilidad1(nombre));
					break;
				case 5:
					System.out.println("Digame que producto quiere buscar");
					nombre=Leer.dato();
					System.out.println("El numero del producto es el: "+ gest.findByNom(nombre)); 
					break;
				case 6:
					System.out.println("Indique el producto del cual quiere sacar el pvp");
					nombre=Leer.dato();
					System.out.println(gest.calcularPvp1(gest.findById(nombre)));
					break;
				case 0:
					break;
				default:
					System.out.println("Opción no disponible");
			}
		}while(op!=0);
		System.out.println("Gracias por usar el programa espero que te haya servido de utilidad");
	}

}
