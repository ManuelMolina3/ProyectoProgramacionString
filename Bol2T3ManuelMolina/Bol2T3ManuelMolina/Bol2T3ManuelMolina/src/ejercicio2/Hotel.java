package ejercicio2;

import java.util.Arrays;

import java.util.Random;

public class Hotel {
	/* ATRIBUTOS */
	public Habitacion[] hab;

	public Hotel(Habitacion[] hab) {
		super();
		this.hab = hab;
	}

	public Habitacion[] getHab() {
		return hab;
	}

	public void setHab(Habitacion[] hab) {
		this.hab = hab;
	}

	@Override
	public String toString() {
		return "Hotel [hab=" + Arrays.toString(hab) + "]";
	}

	public void imprimirLista() {
		for (int i = 0; i < hab.length; i++) {
			System.out.println(hab[i]);
		}
	}

	public int calcularOcupa() {
		int desde = 0, hasta = 4, ocupa;
		Random r = new Random(System.nanoTime());
		ocupa = r.nextInt(hasta - desde + 1) - desde;
		return ocupa;

	}

	public boolean ocupar(int ocupa) {
		if (ocupa == 3) {
			return true;
		} else {
			return false;
		}
	}

	public void imprimirOcupa(boolean b) {
		if (b) {
			System.out.println("Fecha ocupada");
		} else {
			System.out.println("Fecha disponible");
		}
	}

	public double calcularPVP(int tam) {
		double pvp = 0;
		for (int i = 0; i < hab.length; i++) {
			pvp = hab[i].getPrecio() * hab[i].getDias();
		}
		return pvp;
	}

	public void imprimirpvp(double pvp) {
		for (int i = 0; i < hab.length; i++) {
			System.out.println(pvp);
		}
	}

	public double calcularextras(double pvp) {
		int dineroextra = 12;
		for (int i = 0; i < hab.length; i++) {
			if (hab[i].extra) {
				pvp += dineroextra;
			} else {

			}
		}
		return pvp;
	}

	public void mostrarFac(int dineroextra, double pvp) {
		for (int i = 0; i < hab.length; i++) {
			System.out.println("******************************");
			System.out.printf("Número de dias: %d", hab[i].dias);
			System.out.printf("Precio por dia: %.2f euros", hab[i].precio);
			System.out.printf("Precio por extras: %d euros", dineroextra);
			System.out.printf("Precio total: %.2f euros", pvp);
			System.out.println("*******************************");
		}
	}

	public int calcularLimpieza() {
		int desde = 0, hasta = 4, limpieza;
		Random r = new Random(System.nanoTime());
		limpieza = r.nextInt(hasta - desde + 1) - desde;
		return limpieza;

	}

	public boolean verlimpieza(int limpieza) {
		if (limpieza == 3) {
			return true;
		} else {
			return false;
		}
	}

	public void imprimirLimpieza(boolean c) {
		if (c) {
			System.out.println("Fecha ocupada");
		} else {
			System.out.println("Fecha disponible");
		}

	}

	public void add(Habitacion habitaciones, int posicion) {
		hab[posicion] = habitaciones;
	}

	public Habitacion findByNum(String nombreHab) {
		int i = 0;
		boolean encontrado = false;
		while (i < hab.length && !encontrado) {
			Habitacion habi = hab[i];
			if (habi.getNombreHab().equalsIgnoreCase(nombreHab))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return hab[i];
		else
			return null;
	}

}
