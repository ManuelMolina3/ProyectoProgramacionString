package ejercicio1;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0, mayor=0, desde=0, hasta=0, total=0, mediaAlt=0, mediaEsp=50, uno=1, respu=0;
		double media=0.00;
		int[] semana;
		Random monedas= new Random(System.nanoTime());
		System.out.println("Bienvenidos al programa el cual calcula tus ahorros");
		do {
			System.out.println("Digame cuántas semanas quiere ahorrar");
			tam=Leer.datoInt();
			semana= new int [tam];
			
			System.out.println("Digame cuánto es lo máximo que usted cree que podrá ahorrar en una semana");
			hasta=Leer.datoInt();
			System.out.println("Digame cuánto es lo mínimo que usted cree que podrá ahorrar en una semana");
			desde=Leer.datoInt();
			for (int i = 0; i < semana.length; i++) {
				semana[i]=monedas.nextInt(hasta-desde+1)+desde;
				if(semana[i]>mediaEsp) {
				mediaAlt=mediaAlt+uno;	
				}
			}
			for (int i = 0; i < semana.length; i++) {
				System.out.println("monedas\tsemana");
				System.out.println(+semana[i] +"\t");
			}
			for (int i = 0; i < semana.length; i++) {
				
			}
			System.out.println("El número total de monedas ahorradas es de:"+total);
			mayor=semana[0];
			for (int i= 0; i < semana.length; i++) {
			if(semana[i]>semana[0])
			 mayor=semana[i];
			}
			System.out.println("La semana que mas se ahorro es la semana"+mayor+" y se ahorro un total de:"+monedas);
			media=total/semana.length;
			System.out.printf("\nLa media a la semana es de: %.2f",media);
			System.out.println("\nSe han superado"+mediaAlt+"veces");
			System.out.println("\nPor favor eliga una semana");	
			
			
			System.out.println("\nSi quiere cambiar algun valor de alguna semana pulse 1\n Si quiere salir del programa pulse 2");
			respu=Leer.datoInt();
			switch(respu) {
			case 1:
				System.out.println("\nDigame que semana quiere cambiar");
				
				System.out.println("\nDigame que número quiere poner");
				break;
			case 2:
				System.out.println("\nSaliendo");
				break;
				default: 
					System.out.println("\nNo existe esta posibilidad");
			}
		}while(respu!=2);
		System.out.println("\nMuchas gracias por usar este programa espero que le haya servido de utilidad");
	}

}
