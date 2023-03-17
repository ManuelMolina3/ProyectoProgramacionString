package ejemploFor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope = 0;

		System.out.println("Bienvenido al programa que te dice los saludos que necesites en tu vida");
		System.out.println("Por favor diga el numero de holas que quiere recibir");
		tope = Leer.datoInt();
		for (int i = 0; i < tope /* boolean */; i++) {

			/* primero mira el i, luego mira la condición, luego baja a lo que tengamos
			 * dentro de los parentesis y por ultimo sube al incremento, luego va a la
			 * condicion y de la condición va para dentro del parentesis otra vez
			 */
			System.out.println("Hola" + (i + 1));

		}

		System.out.println("Espero que le haya gustado el programa y le haya servido de utilidad");
	}

}
