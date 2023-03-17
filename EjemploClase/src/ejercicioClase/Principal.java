package ejercicioClase;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion a;
		Fraccion b;
		Operador o = new Operador();
		
		int numerador, denominador, op,  num, den;
		System.out.println("digame el numerador de la primera fracción");
		numerador=Leer.datoInt();
		System.out.println("digame el denominador de la primera fracción");
		denominador=Leer.datoInt();
		a = new Fraccion(numerador, denominador);
		System.out.println("digame el numerador de la segunda fracción");
		numerador=Leer.datoInt();
		System.out.println("digame el denominador de la segunda fracción");
		denominador=Leer.datoInt();
		b= new Fraccion(numerador, denominador);
		
		do{
			System.out.println("pulse 1 para hacer una multiplicación de las dos fracciones"
					+ "pulse 2 para dividir las dos fracciones "
					+ "Pulse 3 para cambiar el signo de la fracción");
			op=Leer.datoInt();
			switch(op) {
			
				case 1:
					a= o.multiplicarFraccion(a, b);
					o.ImprimirFra(a);
					break;
					
				case 2:
					
					a= o.dividirFraccion(a, b);
					o.ImprimirFra(a);
					break;
					
				case 3:
					System.out.println("digame un nuevo deominador");
					num=Leer.datoInt();
					System.out.println("digame un nuevo numerador");
					den=Leer.datoInt();
					a=o.cambiarSigno(num, den);
					o.ImprimirFra(a);
					break;
					
				case 0:
					break;
				
			}
			
		}while(op!=0);
		System.out.println("Gracias por utilizar el programa espero que le haya servido de utilidad");
	}

}
