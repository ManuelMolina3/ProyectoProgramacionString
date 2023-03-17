package ejemplo;

import java.util.Arrays;

public class Producto {

	private int lista[];

	public Producto(int[] lista) {
		super();
		this.lista = lista;
	}


	

	public int[] getLista() {
		return lista;
	}



	public void setLista(int[] lista) {
		this.lista = lista;
	}



	@Override
	public String toString() {
		return "Producto [lista=" + Arrays.toString(lista) + "]";
	}
	
	
}
