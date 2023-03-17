package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double precioVip=12.50, precio3D=9.45, precioNor=7.95, precioMati=8.75, precioFinal1=0.00, precioFinal2=0.00, precioFinal3=0.00, precioFinal4=0.00;
		int numEntradas=0;
		String nombEmple=null,nombCli=null;
		System.out.println("Bienvenido al programa el cual va a gestionar las ventas de tus entradas del cine");
		System.out.println("Diga su nombre:");
		nombEmple=Leer.dato();
		
		System.out.println("Bienvenido al cine Aragonés, digame como se llama y cuantas entradas quiere");
		
		do {
		
		System.out.println("número de entradas");
		numEntradas=Leer.datoInt();
		
		System.out.println("Precios de cada sala:\n");
		
		System.out.printf("Precio sala vip: %.2f€, por este precio tendrá:\n "
				+ "Un bol de palomitas pequeño gratuito\n"
				+ "Una bebida pequeña gratuitas\n"
				+ "Asientos extraconfortables.\n", precioVip);
		System.out.printf("Precio sala 3D: %.2f€, por este precio tendrá:\n"
				+ "Asiento confort\n"
				+ "Se regalan las gafas 3D que use en la pelicula\n", precio3D);
		System.out.printf("Precio sala Normal: %.2f€ por este precio podrá disfrutar de:\n"
				+ "Asientos de confort\n"
				+ "Gran gama de peliculas en HD", precioNor);
		System.out.printf("Precio sala Matinal: %.2f€, por este precio se ofrece:\n"
				+ "Un parque sin coste adicional para que los niños jueguen mientras ven la pelicula", precioMati);
		 
		}while(numEntradas!=0); 
			System.out.println("Muchas gracias por usar este programa, espero que te haya sido de utilidad.");
		
		
		
	}

}
