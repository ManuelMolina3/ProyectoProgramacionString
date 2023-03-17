package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, seccion;
		double precioBase, ganancia, porcentajerebaja, libras, nuevoPrecio, precioMax;
		int rebaja, op;
		boolean rebajado = false;
		Producto produc;
		double [] precio= {100.0, 200.0, 3200.0};
		System.out.println("digame el nombre");
		nombre = Leer.dato();
		System.out.println("digame a la sección que pertenece el producto");
		seccion = Leer.dato();
		System.out.println("digame el precio base del producto");
		precioBase = Leer.datoDouble();
		System.out.println("Pulse uno si quiere rebajar el producto o 0 si no quiere rebajarlo");
		rebaja = Leer.datoInt();
		if (rebaja == 1) {
			rebajado = true;
		}
		produc = new Producto(nombre, seccion, precioBase, rebajado);
		do {
			System.out.println("\nPulse 1 para crear el precio de venta al publico"
					+ "\nPulse 2 para palicar el descuento" + "\nPulse 3 para mostrar todos los datos del producto"
					+ "\nPulse 4 para ver en precio en libras esterlinas"
					+ "\nPulse 5 para cambiar el precio del producto"
					+ "\nPulse 6 para poner si el producto es una ganga" + "\nPulse 0 para salir del programa");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					System.out.println("Digame el porcentaje de ganancia que quiere en el producto");
					ganancia = Leer.datoDouble();
					produc.calcularPVP(ganancia);
					System.out.printf("%.2f", produc.calcularPVP(ganancia));
					break;
				case 2:
					System.out.println("Digame el porcentaje de descuento");
					porcentajerebaja = Leer.datoDouble();
					produc.calcularebaja(porcentajerebaja);
					System.out.printf("%.2f", produc.calcularebaja(porcentajerebaja));
					break;
				case 3:
					System.out.printf("%s", produc);// asi se muestra el ToString
					break;
				case 4:
					System.out.println("Digame en cuánto está el cambio en libras");
					libras = Leer.datoDouble();
					System.out.printf("%.2f", produc.calcularLibras(libras));
	
					break;
				case 5:
					System.out.println("Diga el nuevo precio del producto");
					nuevoPrecio = Leer.datoDouble();
					produc.setPrecioBase(nuevoPrecio);
					break;
				case 6:
					System.out.println("Diga el precio tope para que un producto sea una ganga");
					precioMax = Leer.datoDouble();
					produc.imprimirGanga(precioMax);
					break;
				case 7:
					System.out.printf("El precio mayor es: %.2f", produc.calcularCaro(precio));
					break;
				case 0:
					break;
				default:
					System.out.println("Opción no valida");

			}
		} while (op != 0);

	}

}
