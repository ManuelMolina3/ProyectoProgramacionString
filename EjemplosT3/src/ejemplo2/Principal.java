package ejemplo2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		double precio=0, precioNuevo=0;
		Producto produc;
		
		System.out.println("Digame que producto quiere comprar");
		nombre=Leer.dato();
		
		System.out.println("digame el precio del producto");
		precio=Leer.datoDouble();
		
		produc= new Producto (precio, nombre);
		System.out.println(produc.getNombre());
		
		System.out.println("BLACK FRIDAY");
		precioNuevo=Leer.datoDouble();
		
		produc.setPrecio(precioNuevo);
		System.out.println(produc.getPrecio());
		
		System.out.println(produc);
	}

}
