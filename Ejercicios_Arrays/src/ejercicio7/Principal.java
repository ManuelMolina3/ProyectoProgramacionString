package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0;
		double media=0, mediaT=0;
		String nomb="";
		double tiempos[];
		String carreras[];
		int posicion[];
		System.out.println("Bienvenido al programa que te hace la media y te muestra todos los tiempor de las carreras que "
				+ "has corrido");
		System.out.println("Digame su nombre");
		nomb=Leer.dato();
		do {
			System.out.println("\n¿Cuántas carreras has corrido este año?");
			tam=Leer.datoInt();
			media=0;
			tiempos= new double[tam];
			carreras= new String [tam];
			posicion= new int[tam];
			for(int i=0; i<carreras.length; i++) {
				System.out.println("¿Cómo se llama la carrera?");
				carreras[i]=Leer.dato();
				System.out.println("¿Qué tiempo te hiciste en esa carrera?");
				tiempos[i]=Leer.datoDouble();
				System.out.println("¿En qué posición quedaste en esta carrera?");
				posicion[i]=Leer.datoInt();
			}
			System.out.println("Carrera\tTiempo\tPosición");
			for(int i=0; i<carreras.length; i++) {
				
				System.out.printf("%s\t",carreras[i]);
				System.out.printf("%.2f\t",tiempos[i]);
				System.out.printf("%d\n",posicion[i]);
				
			}
			for(int i=0; i<tiempos.length; i++ ){
				media=(media+tiempos[i]);
			}
			mediaT=media/carreras.length;
			System.out.printf("\n%s tu media entre todas las carreras es de:%.2f",nomb, mediaT);
			
			}while(tam!=0);
				System.out.println("Muchas gracias por haber usado el programa suerte en la proxima");
	}

} 