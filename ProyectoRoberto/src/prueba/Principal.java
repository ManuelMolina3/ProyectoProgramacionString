package prueba;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int caso4=0, porcentajeMax=15, porciento=100, op=0, tam=0, uno=1, cero=0, faltas=0, dos=2;
		int[] [] notas;
		String [] nombAsigna;
		System.out.println("Digame el número de asignaturas que tiene");
		tam=Leer.datoInt();
		nombAsigna= new String[tam];
		notas= new int [tam] [dos];
		for (int i = 0; i < notas.length ; i++) {
			System.out.println("Digame por favor el nombre de la asignatura");
			nombAsigna[i]=Leer.dato();
			System.out.println("Digame el número total de horas de esa asignatura");
			notas[i][cero]=Leer.datoInt(); 
			notas[i][uno]=(notas [i] [cero] *porcentajeMax)/porciento;
		}
		do {
			System.out.println("Digamé que desea realizar:\n"
					+ "Pulse 1 para añadir una falta\n"
					+ "Pulse 2 para justificar una falta\n"
					+ "Pulse 3 para ver sus falta\n"
					+ "Pulse 0 para salir de esta opción");
			caso4=Leer.datoInt();
			switch(caso4) {
				case 1:
					System.out.println("Digame en que asigniatura has faltado");
					for (int i = 0; i < nombAsigna.length; i++) {
						System.out.printf("Pulse %d para %s\n",i+1, nombAsigna[i]);
						notas[i][uno]=(notas [i] [cero] *porcentajeMax)/porciento;
					}
					op=Leer.datoInt();
					
					System.out.println("Por favor digame cuantas horas ha faltado");
					faltas=Leer.datoInt();
					
					notas[op] [uno]-=faltas;
					System.out.println("Asignaturas\tHoras\tFaltas\n");
					for(int i=0; i<nombAsigna.length; i++) {
						
					System.out.printf("%s\t%d\t%d\n",nombAsigna[i],notas[i][cero], notas[i] [uno] );
					}
					
					break;
				case 2:
					System.out.println("Digame de que asignatura quiere justificar la falta");
	
					
					
					System.out.println("Por favor digame cuantas horas ha justificado");
					System.out.println("Asignaturas\tHoras\tFaltas\n");
					for(int i=0; i<nombAsigna.length; i++) {
						
					System.out.printf("%s\t%d\t%d\n",nombAsigna[i],notas[i][cero], notas[i] [uno] );
					}
					break;
				case 3:
					System.out.println("Asignaturas\tHoras\tFaltas\n");
					for(int i=0; i<nombAsigna.length; i++) {
						
					System.out.printf("%s\t%d\t%d\n",nombAsigna[i],notas[i][cero], notas[i] [uno] );
					}
					
					
					break;
				case 0:
					
					break;
					default:
						System.out.println("Opción no valida");
						
			}
			
		
		}while(caso4!=0);
	}

}
