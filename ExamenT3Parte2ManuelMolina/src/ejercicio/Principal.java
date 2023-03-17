package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, tam, contadorG=0;
		double presupuesto, cantidadGastada, cantidadN;
		String concepto, idGastos, idB, conceptoN;
		Gastos [] gastos;
		GestionGastos gestionGas;
		
		System.out.println("Bienvenido al programa que te ayudara con los gastos de tus navidades");
		System.out.println("Dígame cuántos tipos de gastos ha tenido en estas navidades");
		tam=Leer.datoInt();
		gastos = new Gastos [tam];
		gestionGas = new GestionGastos(gastos);
		do{System.out.println();
			System.out.println("\nPulse 1 para introducir un gasto nuevo\n"
					+ "Pulse 2 para ver el gasto total \n"
					+ "Pulse 3 para ver todos los gastos y sus características\n"
					+ "Pulse 4 para ver la cantidad que ha gastado en cada gasto\n"
					+ "Pulse 5 para ver si se ha pasado del presupuesto que usted suponia que iba a tener\n"
					+ "Pulse 6 para modificar alguno de los gastos\n"
					+ "Pulse 7 para buscar uno de los gastos\n"
					+ "Pulse 0 para salir del programa\n");
			op=Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Dígame en cuál es el concepto del gasto");
					concepto=Leer.dato();
					System.out.println("Dígame cuánto se ha gastado");
					cantidadGastada=Leer.datoDouble();
					System.out.println("Dígame que id le quiere poner a este gasto");
					idGastos=Leer.dato();
					gestionGas.add(new Gastos (concepto, cantidadGastada, idGastos), contadorG);
					contadorG++;
					break;
				case 2:
					gestionGas.setGastosTotales(0.00);
					gestionGas.calcularTotal();
					System.out.printf("Sus gastos totales son: %.2f euros", gestionGas.getGastosTotales());
					break;
				case 3:
					gestionGas.imprimirTodosGastos();
					break;
				case 4:
					gestionGas.imprimirGasto();
					break;
				case 5:
					System.out.println("Dígame el presupuesto que tenía para estas navidades");
					presupuesto=Leer.datoDouble();
					System.out.printf("%.2f euros",gestionGas.calcularGastoPresupuesto(presupuesto));
					break;
				case 6:
					System.out.println("Dígame el id del gasto que le quiere cambiar lo que se ha gastado ");
					idB=Leer.dato();
					System.out.println("Dígame la nueva cantidad que le quiere poner");
					cantidadN=Leer.datoDouble();
					gestionGas.editGastos(idB, cantidadN);
					break;
				case 7:
					System.out.println("Digame el concepto del gasto que quiere buscar");
					conceptoN=Leer.dato();
					System.out.println(gestionGas.BuscarGasto(conceptoN));
					break;
				case 0:
					break;
				default:
					System.out.println("Opcion no encontrada");
					break;
		
			}
		}while(op!=0);
		System.out.println("Gracias por usar este programa esperamos que le haya servido de utilidad");
	}

}
