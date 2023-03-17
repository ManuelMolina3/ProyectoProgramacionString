package nuevo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=0.0;
		Circulo c1=new Circulo();
		Circulo c2;
		double result=0.0;
		
		
		
		System.out.println("Diga radio");
		radio=Leer.datoDouble();
		c2=new Circulo(radio);
		System.out.println(c2.radio);
		result=c2.calcularArea(radio);
		System.out.printf("El area del circulo es: %.2f", result);
		
	}

}
