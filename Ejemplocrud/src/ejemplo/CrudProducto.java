package ejemplo;

import java.util.Arrays;

public class CrudProducto {
	private Producto[] lista;
	/*
	 * crud= create read update delete por cada clase pojo debe haber una clase crud
	 */

	public CrudProducto(Producto[] lista) {
		this.lista = lista;
	}

	/* solo y exclusivamente para echar una mano pero es muy taleguero */
	public CrudProducto() {
		int cuatro = 4;
		lista = new Producto[cuatro];
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}

	/* ESTO ES NUEVO Y MUY IMPORTANTE */
	/* AGREGAR UN PRODUCTO */
	public void add(Producto p, int posicion) {
		lista[posicion] = p;/* este trozo de codigo es para añadir un producto a la lista */
	}

	/* EDITAR POR EJEMPLO EL PRECIO DEL PRODUCTO */
	public void editPrecio(String codigo, double PrecioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(PrecioN);
		}

	}

	/* BORRAR UN PRODUCTO */
	public void delete(Producto p) {
		//int index = findProduct(p);// devuelve el indice del arrays// SEGUN ESTE EJERCICIO ESTA LINEA NO HAE FALTA
		//la otra manera p.set se cambiaria por Lista[idex]
		if (p!=null)//p!=nul se cambiaria por index>=0
			p.setActivo(false);
	}

	/* BUSCAR UN PRODUCTO A TRAVES DE PASARLE EL CODIGO Y TE DEVUELVE LA LISTA DE OBJETO BUSCADO*/
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i]; /* se ponen sin parentesis debido a que solo tienen una linea */
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return lista[i]; // devuelve el producto buscado
		else
			return null;
	}

	/* OTRA FORMA DE BUSCAR A TRAVES DE PASARLE EL CODIGO*/
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	// OTRA FORMA DE BUSCAR A TRAVES DEL NOMBRE DEL PRODUCTO TE DEVUELVE LA POSICION EN LA QUE ESTA
	public int findProduct(Producto p) {
		int i = 0;
		boolean encontrado = false;
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (p.compareTo(deLista) == 0)
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	/* si queremos buscar todo habria que poner esto */
	public Producto[] findAll() {
		return lista;
	}

	/* MOSTAR TODOS LOS PRODUCTOS DE LA LISTA */
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i + 1) + ". " + lista[i]);
		}
	}

	/*
	 * IMPRIMIR SOLO LOS PRODUCTOS QUR SU ATRIBUTO ACTIVO SEA TRUE, ES DECIR ESTAN A
	 * LA VENTA
	 */
	public void imprimirSoloActivos() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (lista[i].isActivo()) {
				System.out.println((i + 1) + ". " + lista[i]);
			}
		}
	}
}
