package ejercicio1;

import java.util.Arrays;



public class Gestion {
	/* atributo */
	private Producto productos[];

	public Gestion(Producto[] productos) {
		super();
		this.productos = productos;
	}

	public Gestion() {
		super();
	}

	/* ToString */
	@Override
	public String toString() {
		return "Gestion [produc=" + Arrays.toString(productos) + "]";
	}

	/* GettersAndSetters */
	public Producto[] getProduc() {
		return productos;
	}

	public void setProduc(Producto[] productos) {
		this.productos = productos;
	}

	/* METODOS */

	/* LISTADO */
	public void listar() {
		for (int i = 0; i < productos.length; i++) {
			System.out.println((i + 1) + ". " + productos[i]);
		}
	}

	/* ESTE ES EL QUE ESTA BIEN PVP */
	public double calcularPvp1(Producto p) {
		double cien = 100;
		return p.getPrecioFabri() + p.getPrecioFabri() * p.getGanancia() / cien;
	}

	/* CALCULAR PVP */
	public double[] calcularPvp(int tam) {
		double[] pvp;
		pvp = new double[tam];
		int cien = 100;
		for (int i = 0; i < productos.length; i++) {

			pvp[i] = productos[i].getPrecioFabri() + productos[i].getPrecioFabri() * productos[i].getGanancia() / cien;
		}
		return pvp;
	}

	/* IMPRIMIR PVP */
	public void imprimirPVP(double[] pvp) {
		for (int i = 0; i < productos.length; i++) {
			System.out.printf("El precio del producto es %.2f €\n", pvp[i]);
		}
	}

	// comprobar fragil gueno hecho flama
	public boolean comprobarFragilidad1(String nombre) {
		Producto p = findById(nombre);
		if (p.isFragilidad()) {
			return true;
		} else {
			return false;
		}
	}

	//imprimir fragilidad
	public void imprimirFragil(boolean b) {
		if (b) {
			System.out.println("CUIDADO FRÁGIL QUIETORRR");
		} else {
			System.out.println("No te rayes esto puede hasta con ...");
		}
	}

	/* COMPROBAR FRAGILIDAD MALISIMO */
	public void comprobarFragilidad() {
		for (int i = 0; i < productos.length; i++) {
			System.out.printf("El producto es fragil %s \n", productos[i].isFragilidad());
		}

	}

	/* AGREGAR PRODUCTO */
	public void add(Producto producto, int posicion) {
		productos[posicion] = producto;
	}

	public Producto findById(String nombre) {
		int i = 0;
		boolean encontrado = false;

		// Mientras no hayamos llegado al final o encontrado lo que buscamos repetimos
		// el bucle
		// Al encotrarlo, el bucle para
		while (i < productos.length && !encontrado) {
			Producto deLista = productos[i];
			if (deLista.getNombre().equalsIgnoreCase(nombre))
				encontrado = true;
			else
				i++;
		}

		if (encontrado)
			return productos[i];// Devolvemos el producto buscado
		else
			return null;
	}

	/* BUSCAR PRODUCTO POR NOMBRE */
	public Producto[] findByNom(String nombre) {
		int i = 0;
		
		Producto[] aux = new Producto[productos.length];

		while (i < productos.length) {
			Producto deLista = productos[i];
			if (deLista.getNombre().equalsIgnoreCase(nombre)) {
				aux[i] = productos[i];
				

			}
			/* para que lo haga siempre fuera del if */
			i++;
		}

		return aux;

	}
}
