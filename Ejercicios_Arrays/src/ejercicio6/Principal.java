package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int tam=0, salida=0;
		 String[] producto;
		 double[] precio;
		 
		 
		 System.out.println("Bienvenido al programa para poner los precios de supermercados Rafael");
		 
		 do {
			 System.out.println("¿Cúantos productos tiene?");
			 tam=Leer.datoInt();
			 producto= new String[tam];
			 precio= new double [tam];
		 
			 for(int i=0; i<producto.length; i++) {
			 
				 System.out.println("¿Cómo se llama el producto?");
				 producto[i]=Leer.dato();
			 }
		 
			 for(int i=0; i<precio.length; i++) {
				 System.out.println("¿Qué precio tiene tu producto?");
				 precio[i]=Leer.datoDouble();
			 }
			 System.out.println("\n");
			 for(int i=0; i<producto.length; i++) {
				 System.out.printf("%s\t", producto[i]); 
			 }
			 System.out.println(" ");
		 
			 for(int i=0; i<precio.length; i++) {
				 System.out.printf("%.2f€ \t", precio[i]);
			 }
			 System.out.println("\n");
			 
			 System.out.println("Pulse 0 para salir o cualquier número para continuar");
			 salida=Leer.datoInt();
		 	}while(salida==0);
		 
		 	System.out.println("Muchas gracias por haber confiado en el programa espero que le haya servido de utilidad");
	}
	

}
