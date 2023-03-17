package ejemploArrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=0, respu=0, suma=0 ;
		int edades [];
		
		System.out.println("Digama el tamaño del que quiere el arrays");
		tam=Leer.datoInt();
		edades= new int [tam];
		
		for (int i=0; i<edades.length; i++){
			System.out.println("Diga una edad");
			edades[i]=Leer.datoInt();
		}
		
		//Para mostar
		for(int i=0; i<edades.length; i++) {
			System.out.println("\nSu edad es: " +edades[i] +" años");
			
		}
		System.out.println("¿Qué elemento quieres cambiar?");
		respu=Leer.datoInt() -1;
		System.out.println("¿Nuevo valor?");
		edades[respu]=Leer.datoInt();
		
		for(int i=0; i<edades.length; i++) {
			System.out.println("\nSu edad es: " +edades[i] +" años");
			
	}
		for (int i=0; i<edades.length; i++) {
			suma=suma+edades[i];
			
		}
		System.out.println("La suma es: " +suma);
	}
}
