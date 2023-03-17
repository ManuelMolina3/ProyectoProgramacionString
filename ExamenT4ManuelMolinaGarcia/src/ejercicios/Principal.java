package ejercicios;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		double porcentajeIva=15, precio1=40, precio2=70, porcentajeDes=15, cantidadFija=20;
		Entradas e1= new Grupos (1, 13, 15, 12);
		Entradas e2= new Grupos (1, 10, 12, 9);
		Entradas e3= new Vip (2 , 10, 13, "Paco");
		Entradas e4= new Vip (1, 13, 17, "Luis");
		
		Entradas [] listaEntradas = {e1, e2, e3, e4};
		Taquilla taqui= new Taquilla (listaEntradas);
		do {
			System.out.println("Pulse 1 para calcular el precio de una entrada buscando por el asiento"
					+ "Pulse 2 para ver todo lo recaudado en la taquilla"
					+ "Pulse 3 para ver todo lo recaudado en la zona 1"
					+ "Pulse 4 para imprimir el tickect de la zona vip"
					+ "Pulse 5 para ver lo que se a gastado por cada entrada en iva"
					+ "Pulse 0 para salir");
			op=Leer.datoInt();
			switch(op) {
			case 1:
				
				break;
			case 2:
				System.out.printf("El total es: %.2f", taqui.calcularTotal(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija));
				
				break;
			case 3:
				System.out.printf("El total vendido en la zona 1 es: %.2f",  taqui.calcularVentaTotalZ1(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija));
				break;
			case 4:
				taqui.ImprimirVips();
				break;
			case 5:
				System.out.println(taqui.CalcularIvaCadaEntrada(porcentajeIva, precio1, precio2));
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no encontarada");
				break;
			}
		}while (op!=0);
		System.out.println("Gracias por utilizar el programa");
	}

}
