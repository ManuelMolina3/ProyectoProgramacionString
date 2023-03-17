package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad;
		double res=0.0;
		Circulo cir1, cir2, cir3;
		//Forma 1 cascaporra style
		 cir1= new Circulo(5.6);
		// Forma 2: leyendo por teclado
		 System.out.println("Digame el radio del circulo que quiere calcular");
		 rad=Leer.datoDouble();
		 cir2= new Circulo(rad);
		 System.out.println(cir2.radio);
		 
		 
		 //Forma 3: objeto vacio
		 cir3= new Circulo(rad);
		 System.out.println(cir1.radio);
		 
		 //llamadas a métodos ¿como se llama a un metodo?
		 //nombre del objeto . y el nombre del metodo
		 
		 res=cir3.calcularArea();
		 System.out.printf("El área del circulo es: %.2f", res);
		 
	}

}
