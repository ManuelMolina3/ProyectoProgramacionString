package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo mal para no olvidarlo.
		Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho texto
		una cantidad de veces igual al número introducido. La clase se puede llamar "Copiado".*/
		int num=0;
		String txt;
		Copy numtext= new Copy();
		System.out.println("Digame el texto que quiere imprimir");
		txt=Leer.dato();
		System.out.println("Digame cuántas veces quiere imprimir el texto");
		num=Leer.datoInt();
		numtext.imprimirCopy(txt, num);
		
	}

}
