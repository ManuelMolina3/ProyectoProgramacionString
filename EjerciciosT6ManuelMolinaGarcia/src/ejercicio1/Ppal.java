package ejercicio1;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*1) Realizar un programa que haga las operaciones básicas de una calculadora solo con números
	enteros (sumar, resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones
	que se pueden producir (entrada de datos, división por cero, raíz de un número negativo, etc.)*/
		int  num1=0, num2=0, op=1;
		double resul=0.00;
		
		do {
			try {
			System.out.println("Digame el primer número");
			num1=Leer.datoInt();
			System.out.println("Digame el segundo número");
			num2=Leer.datoInt();
			System.out.println("1-. Suma");
			System.out.println("2-. Resta");
			System.out.println("3-. Multiplicación");
			System.out.println("4-. División");
			System.out.println("0-. Salir del programa");
			op=Leer.datoInt();
			switch(op) {
			case 1:
				resul=num1+num2;
				System.out.printf("el resultado es: %.2f", resul);
				break;
			case 2:
				resul=num1-num2;
				System.out.printf("el resultado es: %.2f", resul);
				break;
			case 3:
				resul=num1*num2;
				System.out.printf("el resultado es: %.2f", resul);
				break;
			case 4:
				resul=num1/num2;
				System.out.printf("el resultado es: %.2f", resul);
				break;
			case 5:
				
				break;
			case 0:
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
			}catch (ArithmeticException e) {
				System.err.println("¡Error estas dividiendo entre 0!");
			}catch (NumberFormatException e) {
				System.out.println("¡No metas letritas que era un númerito!");
			}catch (Exception e) {
				System.err.println("¡Error INESPERADO!");
			}
		}while(op!=0);

	}

}
