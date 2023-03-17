package proyecto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int asignaturas=0, caso4=0, porcentajeMax=15, porciento=100, faltas=0;
		double porcentajeT=0.00;
		int [] faltasDispo;
		int[] alumnos;
		int [] horasAsigna;
		String[] nombAlumnos;
		String[] nombAsigna;
		System.out.println("Por favor digamé cuántas asignaturas tiene");
		asignaturas=Leer.datoInt();
		nombAsigna= new String[asignaturas];
		horasAsigna= new int [asignaturas];
		faltasDispo= new int [asignaturas];
		for(int i=0; i<nombAsigna.length; i++) {
			System.out.println("Digame por favor el nombre de la asignatura");
			nombAsigna[i]=Leer.dato();
			System.out.printf("Digamé por favor cuántas horas tiene %s:\n", nombAsigna[i]);
			horasAsigna[i]=Leer.datoInt();
			System.out.println("");
			
		}
		for (int i = 0; i < nombAsigna.length; i++) {
			faltasDispo[i]=(horasAsigna[i]/porcentajeMax) * porciento;
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
				
				asignaturas=Leer.datoInt();
				
				System.out.println("Por favor digame cuantas horas ha faltado");
				
				faltas=Leer.datoInt();
				
				faltasDispo[asignaturas]-=faltas;
				break;
			case 2:
				System.out.println("Digame de que asignatura quiere justificar la falta");

				asignaturas=Leer.datoInt();
				
				System.out.println("Por favor digame cuantas horas ha justificado");
				
				faltas=Leer.datoInt();
				
				faltasDispo[asignaturas]+=faltas;
				break;
			case 3:
				System.out.println("Asignatura\tHoras\tFaltas");
				for (int i = 0; i < nombAsigna.length; i++) {
					System.out.printf("%s\t\t",nombAsigna[i]);
					System.out.printf("%d\t",horasAsigna[i]);
					System.out.printf("%d\n",faltasDispo[i]);
				}
				break;
			case 0:
				break;
			}
		
		}while(caso4!=0);
		
		
			
			
		}
		
}


	


