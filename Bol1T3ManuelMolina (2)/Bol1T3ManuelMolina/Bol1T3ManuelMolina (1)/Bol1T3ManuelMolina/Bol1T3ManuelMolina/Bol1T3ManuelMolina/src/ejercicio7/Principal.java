package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Se desea llevar un control del estado de una cuenta corriente. Una cuenta
		 * corriente está caracterizada por su saldo y el nombre del titular y sobre
		 * ella se pueden realizar tres tipos de operaciones: • Ingresar (cantidad):
		 * ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime
		 * de nuevo el saldo, pero sí lo actualiza. • Retirar (cantidad): Debe comprobar
		 * si queda suficiente saldo y si es así, disminuye la cuenta una determinada
		 * cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo,
		 * pero sí lo actualiza. • Calcular el saldo en dólares americanos. Se le debe
		 * pasar el valor de cambio y debe devolver el valor del saldo en dólares. •
		 * Consultar el saldo. Solo imprime el saldo. Supón que la cuenta inicialmente
		 * tiene un saldo de cero. Escribe una clase CuentaCorriente que implemente las
		 * funcionalidades descritas y un main con un menú para probarlas.
		 */

		double saldoMas = 0, saldoMenos = 0;
		int op;
		String nombre = "";
		double saldo = 0;
		CuentaCorriente cuentaCorriente;
		System.out.println("\t**************");
		System.out.println("\t CAJA DINERAL");
		System.out.println("\t***************");
		System.out.println("Digame su nombre");
		nombre = Leer.dato();
		System.out.println("Diga su saldo");
		saldo = Leer.datoDouble();
		cuentaCorriente = new CuentaCorriente(saldo, nombre);
		do {
			System.out.printf("\nDigame que operacion quiere realizar %S", nombre);
			System.out.println("\n****************************************");
			System.out.println("Pulse 1 para ingresar dinero" + "\nPulse 2 para retirar dinero"
					+ "\nPulse 3 para ver su saldo en dolares" + "\nPulse 4 para ver su saldo actual"
					+ "\nPulse 0 para salir del programa");
			System.out.println("****************************************");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					System.out.println("Digame el saldo que quiere retirar");
					saldoMas = Leer.datoDouble();
					cuentaCorriente.ingresarDinero(saldoMas);
					break;
				case 2:
					System.out.println("Digame el saldo que quiere retirar");
					saldoMenos = Leer.datoDouble();
					cuentaCorriente.imprimirDinero(cuentaCorriente.retirarDinero(saldoMenos));
					break;
				case 3:
					System.out.printf("Su saldo en dolares es: %.2f", cuentaCorriente.cambiarDolares());
	
					break;
				case 4:
					System.out.printf("Su saldo actual es de: %.2f euros ", cuentaCorriente.getSaldo());
	
					break;
				case 0:
					break;
			}

		} while (op != 0);
		System.out.printf("Gacias por confiar una vez mas en nosotros %S, esperamos verte pronto", nombre);
	}

}
