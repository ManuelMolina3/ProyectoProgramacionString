package ejercicio6;

import java.util.Random;

public class Moneda {
	//atributos
	//no hay
	//constructores
	public Moneda() {
		
	}
	//metodos
	public int lanzamiento (int eleccion) {
		int desde=1, hasta=2;
		int caraCruz;
		Random elec= new Random (System.nanoTime());
		caraCruz=elec.nextInt(hasta-desde+1)-desde;
		return caraCruz;
	}
	public boolean comprobar (int eleccion, int caraCruz) {
		if (eleccion==caraCruz) {
			return true;
		}else {
			return false;
		}
	}
	public void imprimir (boolean b) {
		if (b) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Intentalo otra vez");
		}
	}
}
