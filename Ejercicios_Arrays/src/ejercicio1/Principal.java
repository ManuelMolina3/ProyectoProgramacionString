package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y
		mostrarlo por la pantalla mediante un bucle for*/
		int tam=5, seguir=0;
		String[] nomb;
		nomb= new String[tam];
		
		System.out.println("Bienvenidos al rpograma que te pregunta el nombre de tus 5 personas mas queridas");
		
		do {
		for(int i=0; i<nomb.length; i++){
			System.out.println("¿Cómo se llama esta persona?");
			nomb[i]=Leer.dato();
		}
		for (int i=0; i<nomb.length; i++) {
			System.out.printf("%s es una persona muy especial para ti \n", nomb[i]);
		}
		System.out.println("Si tienes más personas queridas en tu vida pulsa 1, si no pulse cualquier número");
		seguir=Leer.datoInt();
		}while(seguir==1);
		System.out.println("Muchas gracias por confiar en este programa espero que te haya servido de utilidad");
	}

}
