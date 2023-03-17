package primeraexcepcion;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, deno=0;
		double resultado;
		do {
			try {
				System.out.println("Ponga el número que quiere poner en el numerador");
				num=Leer.datoInt();
				System.out.println("Ponga el número que quiere poner en el denominador");
				deno=Leer.datoInt();
				resultado=num/deno;
				System.out.println(resultado);
			}catch (ArithmeticException e) {
				System.err.println("¡Error estas dividiendo entre 0!");
			}catch (NumberFormatException e) {
				System.err.println("¡No metas letritas que era un númerito!");
			}catch (Exception e) {
				System.err.println("¡Error INESPERADO!");
			}
		}while(deno!=0);
	}
}
