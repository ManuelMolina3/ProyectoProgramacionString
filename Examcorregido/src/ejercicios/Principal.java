package ejercicios;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasteleria tarta;
		String sabor;
		int tam, eleccionExtra, op, cero, hasta, desde, cambiarDias, CambiarTartas;
		double precioLitro, volumen, ganancia, costeExtra;
		int []cantTartas;
		boolean extraNormal;
		System.out.println("-----------------------------------------");
		System.out.println("BEINVENIDO AL PROGRAMA DE LA PASTELERIA");
		System.out.println("-----------------------------------------");
		System.out.println("Digame cuántos dias quiere contabilizar");
		tam=Leer.datoInt();
		cantTartas= new int [tam];
		System.out.println("digame que precio tiene el litro de leche");
		precioLitro=Leer.datoDouble();
		System.out.println("digame cuanto es el volumen de tus tartas");
		volumen=Leer.datoDouble();
		System.out.println("digame cual es el sabor de sus tartas");
		sabor=Leer.dato();
		System.out.println("Pulse 1 para añadirle extra o 0 si no quiere");
		eleccionExtra=Leer.datoInt();
		if(eleccionExtra==1) {
			extraNormal=true;
		}else {
			extraNormal=false;
		}
		tarta= new Pasteleria (sabor, precioLitro, volumen, extraNormal);
		do {
			op=Leer.datoInt();
			switch(op){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				break;
			}
		}while(op!=0);
	}

}
