package ejercicio4;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y
		mostrar el número guardado en un lugar que indique el usuario por teclado.*/
		
		int tam=10, hasta=99, desde=1, seguir=0;
		Random num2= new Random(System.nanoTime());
		int[] num;
		num=new int[tam];
		do {
		System.out.println("Bienvenidos al programa el cual te da 10 números aleatorios comprendidos entre el 1 y el 99");
		
		for(int i=0; i<num.length; i++) {
			num[i]=num2.nextInt(hasta-desde+1)+desde;
			
		}
		for (int i=0; i<num.length; i++) {
		System.out.println(num[i]);
		}
		System.out.println("¿Quiere seguir sacando números aleatorios?");
		System.out.println("Pulse 1 para continuar");
		seguir=Leer.datoInt();
		}while(seguir==1);
		System.out.println("Gracias por usar el programa, espero que te hayas divertido y te haya servido de utilidad");
	}

}
