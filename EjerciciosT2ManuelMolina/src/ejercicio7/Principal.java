package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*7. Leer un número entero y mostrar su tabla de multiplicar.*/
		
		
		
		int num1=0, num2=10, result=0;
		
		
		System.out.println("Bienvenidos al programa el cual saca la tabla de multiplicar de cualquier número (1 al 10) por los números del 1 al 10");
		
		
		do {
			System.out.println("Diga el número que quiere multiplicar");
			num1=Leer.datoInt();
			if(num1==0) {
				System.out.println("Saliendo");
			}
			else {
			for(int i=0; i<=num2; i++) {
			
				result=num1* i;
				System.out.println(""+num1 + "x" +i+ "=" +result );
						
		}
			}
			 
		}while(num1!=0); 
			System.out.println("Gracias por confiar en nosotros espero que le haya sido de utilidad el programa");
		
		
		}

	}


