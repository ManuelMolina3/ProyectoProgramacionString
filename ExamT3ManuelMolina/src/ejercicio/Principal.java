package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sabor;
		double precioLitro, volumenTarta;
		int extraSiNo, tam, op, desde, hasta, ganancia;
		boolean extra= false;
		int [] cantidadTartas;
		double precioFabri=0.00, pvp=0.00, precioExtra=0.00;
		Pasteleria tartas;
		
		System.out.println("Bienvenido a la pasteleria Lola digame de que sabor quiere la tarta");
		sabor=Leer.dato();
		System.out.println("Digame cuánto cuesta el litro de masa");
		precioLitro=Leer.datoDouble();
		System.out.println("Digame cuántos litros de masa necesita para hacer una tarta");
		volumenTarta=Leer.datoDouble();
		System.out.println("Si quiere ponerle extras a la tarta pulse 1 sino pulse 0");
		extraSiNo=Leer.datoInt();
		if (extraSiNo==1) {
			extra= true;
		}else {
			extra= false;
		}
		System.out.println("Digame de cuántos digas quiere calcular la cantidad de tartas");
		tam=Leer.datoInt();
		cantidadTartas= new int[tam];
		tartas= new Pasteleria (sabor, precioLitro, volumenTarta, extra, cantidadTartas);
		do{
			System.out.println("\nPulse 1 para ver cuantas tartas ha conseguido vender en " +tam +" dias"
					+ "\nPulse 2 para ver cual es el precio de fabricante que le costaria hacer una tarta"
					+ "\nPulse 3 para ver el precio de venta al publico "
					+ "\nPulse 4 para ver el precio de las tartas si les has añadido extra"
					+ "\nPulse 5 para ver el total de tartas en una semana"
					+ "\nPulse 6 para cambiar la cantidad de tartas en un dia en concreto "
					+ "\nPulse 7 para ver la media de tartas en una semana"
					+ "\nPulse 0 para salir del programa");
			op=Leer.datoInt();
			switch(op) {
			case 1:
				System.out.println("Digame cuánto es lo mínimo de tarta que ha vendido en un dia");
				desde=Leer.datoInt();
				System.out.println("Digame cuánto es lo máximo de tarta que ha vendido en un dia");
				hasta=Leer.datoInt();
				tartas.generarNumTartas(hasta, desde, tam);
				tartas.imprimirNumTartas(tam);
				break;
			case 2:
				tartas.calcularPrecioFabri();
				tartas.imprimirPrecioFabri(precioFabri);
				break;
			case 3:
				System.out.println("Digame el porcentaje de ganancia que quiere conseguir por cada tarta");
				ganancia=Leer.datoInt();
				tartas.calcularPVP(ganancia, precioFabri);
				tartas.imprimirPVP(pvp);
				break;
			case 4:
				if(extra) {
					System.out.println("Por favor digame cuánto es el precio extra que quiere añadir");
					precioExtra=Leer.datoDouble();
					tartas.calcularExtra(pvp, precioExtra);
					tartas.imprimirPrecioExtra(pvp);
					
				}
				break;	
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		}while(op!=0);
		System.out.println("Gracias por usar el programa espero que le haya servido de utilidad");
	}

}
