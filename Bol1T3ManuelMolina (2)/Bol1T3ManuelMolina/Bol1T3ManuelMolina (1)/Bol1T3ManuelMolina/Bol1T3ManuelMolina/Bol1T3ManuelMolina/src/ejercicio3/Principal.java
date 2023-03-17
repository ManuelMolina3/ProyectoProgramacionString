package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=0, altura=0, volumen=0;
		Cilindro cili1;
		System.out.println("Bienvenido al programa el cual te calcula el volumen de tu cilindro");
		System.out.println("Digame el radio del cilindro");
		radio=Leer.datoDouble();
		System.out.println("Digame por favor la altura del cilindro");
		altura=Leer.datoDouble();
	
		cili1= new Cilindro(radio, altura);
		volumen=cili1.calcularvolumen();
		System.out.printf("El volumen de tu cilindro es igual a %.2f", volumen);
		
		
	}

}
