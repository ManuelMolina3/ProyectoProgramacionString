package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa , pero
		 * estilo hotel para que tenga caché. Debemos gestionar mi “minihotel” y para
		 * ello, debemos crear la clase Habitación, una clase Hotel con una lista de
		 * Habitaciones y una clase de prueba para gestionar el hotel (realmente habría
		 * algunas clases más, como serían Cliente, Productos, etc. Pero no entraremos
		 * en eso). Se podrá crear una habitación (cuyos atributos serán tipo, precio,
		 * qué servicios extra tiene, nombre de cliente asignado, número de días
		 * contratados, etc.) ver si está ocupada o no, calcular precio final según
		 * número de días, servicios extra contratados y consumo del minibar, mostrar
		 * factura, comprobar si está “limpia” (que ha pasado la limpiadora cada día) y
		 * aquellos métodos que se quieran añadir. Crear un main de prueba.
		 */
		int op, tam, dias, extraSN, dineroextra = 12, contadorP = 0;
		Habitacion hab[];
		Hotel hotel;
		String nombCli, tipoHab, nombreHab;
		double precio;
		boolean extra;
		System.out.println("Bienvenido al hotel Molina");

		System.out.println("Digame cuantas habitaciones querria");
		tam = Leer.datoInt();
		hab = new Habitacion[tam];
		hotel = new Hotel(hab);
		do {
			System.out.println("Pulse 1 para añadir una nueva habitación"
					+ "Pulse 2 para cualcular el precio durante toda la estancia"
					+ "Pulse 3 para buscar las caracteristicas de una de las habitaciones"
					+ "Pulse 4 para ver los servicios contratados" + "Pulse 5 ver si esta ocupada la habitación"
					+ "Pulse 6 para comprobar si esta limpia la habitación" + "Pulse 0 para salir del programa");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					System.out.println("Digame el nombre de la habitación que quiere");
					nombreHab = Leer.dato();
					System.out.println("Digame el tipo de habitación que quieres");
					tipoHab = Leer.dato();
					System.out.println("Digame el precio del la habitación por dia");
					precio = Leer.datoDouble();
					System.out.println("Digame cuántas noches va a querer estar");
					dias = Leer.datoInt();
					System.out.println("Pulse 1 si quiere usar el mini bar y sevicio de limpieza");
					extraSN = Leer.datoInt();
					if (extraSN == 1) {
						extra = true;
					} else {
						extra = false;
					}
					System.out.println("Digame su nombre");
					nombCli = Leer.dato();
					hotel.add(new Habitacion(tipoHab, precio, extra, nombCli, dias, nombreHab), contadorP);
					contadorP++;
					break;
				case 2:
					hotel.imprimirpvp(hotel.calcularPVP(tam));
					break;
				case 3:
					System.out.println("Digame el nombre de la habitación que quiere buscar");
					nombreHab = Leer.dato();
					hotel.findByNum(nombreHab);
					break;
				case 4:
					hotel.mostrarFac(dineroextra, hotel.calcularextras(hotel.calcularPVP(tam)));
					break;
				case 5:
					hotel.imprimirOcupa(hotel.ocupar(hotel.calcularOcupa()));
					break;
				case 6:
					hotel.imprimirLimpieza(hotel.verlimpieza(hotel.calcularLimpieza()));
					break;
				case 0:
	
					break;
				default:
					System.out.println("Opción no valida");
					break;
			}

		} while (op != 0);
		System.out.println(
				"Gracias por haber alquilado nuestras habitaciones esperamos volver a verte por nuestras instalaciones");
	}

}
