package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lista[];
		int [] nuevolista;
		int tam=2;
		lista= new int [tam];
		nuevolista= new int [tam];
		System.out.println("digame los precios");
		for (int i=0; i<lista.length; i++) {
			lista[i]=Leer.datoInt();
		}
		Producto produc = new Producto (lista);
		System.out.println("Digame que números quiere cambiar");
		for (int i = 0; i < lista.length; i++) {
			nuevolista[i]=Leer.datoInt();
			
		}
		produc.setLista(nuevolista);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(produc.getLista()[i] ); 
		}
	}

}
