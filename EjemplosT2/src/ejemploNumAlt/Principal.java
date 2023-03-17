package ejemploNumAlt;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=0, tope=3;
		int hasta=0, desde=0;
		Random num= new Random (System.nanoTime());
		
		System.out.println("Vamos a generar aleatorio");
		System.out.println("Diga el mayor");
		hasta=Leer.datoInt();
		System.out.println("Diga el menor");
		desde=Leer.datoInt();
		
		for( int i=0; i<tope; i++) {
			
			aleatorio= num.nextInt(hasta-desde+1)+desde;
			System.out.println("El número premiado es el:" +aleatorio);
		}
	}

}
