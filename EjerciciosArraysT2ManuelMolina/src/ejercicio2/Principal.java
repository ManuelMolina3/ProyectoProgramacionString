package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. Implementar un programa que rellene automáticamente un array de enteros con 10 posiciones,
		cada elemento debe contener el valor del doble de su índice. Mostrar el resultado por pantalla.*/
		int tam=0, dos=2;
		int[] num;
		System.out.println("Bienvenido al programa que te el doble del valor del indice anterior por 10 de tu número");
		
		do {
			System.out.println("Digame cúantos números quiere en su tabla");
			tam=Leer.datoInt();
			num= new int[tam];
			for(int i=0; i<num.length; i++) {
				num[i]= i *dos;
			}
			for(int i=0; i<num.length; i++) {
			System.out.println("El resultado es:" +num[i]);
			}
		}while(tam!=0);
		System.out.println("Muchas gracias por haber usado este programa espero que te haya servido.");
	}

}
