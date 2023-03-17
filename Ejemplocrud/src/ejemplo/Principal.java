package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam, op, contadorP = 0;
		String codigo, nombre, codigoAbus;
		double precioUnitario, precioN;
		CrudProducto crud;
		Producto[] p;
		System.out.println("Bienvenido a la aplicacion de CRESPO");
		System.out.println("Digame cuantos productos tiene");
		tam = Leer.datoInt();
		p = new Producto[tam];
		crud = new CrudProducto(p);
		do {
			System.out.println("Pulse 1 para agregar un nuevo producto\n"
					+ "Pulse 2 para ver la lista de productos\n "
					+ "Pulse 3 para comparar si dos productos son iguales\n");
			op = Leer.datoInt();
			switch (op) {
				case 1:
	
					System.out.println("Diga el nombre del producto");
					nombre = Leer.dato();
					System.out.println("Digame el codigo");
					codigo = Leer.dato();
					System.out.println("Diga el precio por unidad");
					precioUnitario = Leer.datoDouble();
					crud.add(new Producto(codigo, nombre, precioUnitario, true), contadorP);
					contadorP++;
					break;
				case 2:
					/*MOSTRAR SOLO EL PRODUCTO PEDIDO POR CODIGO*/
					System.out.println("Diga usted el código");
					codigoAbus=Leer.dato();
					System.out.println(crud.findById(codigoAbus));
					break;
				case 3:
					/*MOSTRAR TODOS LOS PRODUCTOS*/
					crud.imprimirTodosLosProductos();
					break;
				case 4:
					//ESTE CASO SIRVE PARA EDITAR EL PRECIO DEL PRODUCTO
					System.out.println("Indique el codigo del producto para modificarlo");
					crud.imprimirSoloActivos();
					codigo=Leer.dato();
					System.out.println("Indique el nuevo precio");
					precioN=Leer.datoDouble();
					crud.editPrecio(codigo, precioN);
					break;
				case 5:
					//SIRVE PARA BORRAR EL PRODUCTO INDICADO POR TECLADO  
					
					System.out.println("Diga el codigo del producto que quiera borrar");
					codigo=Leer.dato();
					crud.delete(crud.findById(codigo));
					break;
				case 6:
					
					
					break;

			}
		} while (op != 0);

	}

}
