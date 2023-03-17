package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Producto produc;
			String nombre, seccion;
			double precioBase, pvp, libra;
			int rebaja, ganancia, porcentaje, op;
			System.out.println("***************");
			System.out.println("Deportes Crespo");
			System.out.println("***************");
			System.out.println("Bienvenido a deportes Crespo por favor diga el nombre del producto");
			nombre=Leer.dato();
			System.out.println("Digame de que categoria se trata su producto");
			seccion=Leer.dato();
			System.out.println("Por favor digame el precion base de su producto");
			precioBase=Leer.datoDouble();
			System.out.println("Por favor pulse 1 para aplicar descuento al producto"
					+ "o pulse 0 para no aplicar rebaja al producto");
			rebaja=Leer.datoInt();
			produc= new Producto (nombre, seccion, precioBase,rebaja);
			do {
				System.out.println("Pulse 1 para calcular el PVP del producto"
						+ "Pulse 2 para aplicar el descuento al producto"
						+ "Pulse 3 hacer el cambio a libras del producto"
						+ "Pulse 4 para cambiar el precio del producto"
						+ "Pulse 5 para obtener los datos del producto"
						+ "Pulse 6 para ver el PVP"
						+ "Pulse 0 para salir");
				op=Leer.datoInt();
				switch(op) {
				case 1:
					System.out.println("Por favor digame el porcentaje de ganancia que le quiere sacar al producto");
					ganancia=Leer.datoInt();
					
					break;
				case 2: 
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 0:
					break;
				default:
					System.out.println("Opción no encontrada");
				}
				
				
			}while (op!=0); 
				
			System.out.println("Gracias por usar este programa");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	

}
