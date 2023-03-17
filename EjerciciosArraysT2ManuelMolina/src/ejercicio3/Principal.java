package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con números leídos por
		teclado y mostrar la media de todos los elementos y la cantidad de números “cero” introducidos.*/
		int tam=8, uno=1, num0=0, cero=0, suma=0, respu=0;
		double media=0;
		double notas[]= new double[tam];
		System.out.println("Bienvenidos a el programa de tus notas del curso");
		do {
			System.out.println("Introduzca porfavor sus 8 notas");
			for (int i = 0; i < notas.length; i++) {
				notas[i]=Leer.datoDouble();
				if(notas[i]==cero){
					num0=+uno;
				}
			}	
			for (int i = 0; i < notas.length; i++) {
				System.out.printf("Su notas es:%.2f\n", notas[i]);
			}
			for (int i= 0;  i< notas.length; i++) {
				suma+=notas[i];
				
			}
			media=suma/notas.length;
			System.out.printf("la media es:%.2f\n", media);
			System.out.println("Usted a tenido "+num0 +" ceros");
			System.out.println("Desea continuar con el programa\nPulse cualquier número para continuar o cero para cerrar el programa");
			respu=Leer.datoInt();
		}while(respu!=0);
		System.out.println("Muchas gracias por usar mi programa, espero que le haya servido de utilidad");
	}

}
