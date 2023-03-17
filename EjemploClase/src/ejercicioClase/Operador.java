package ejercicioClase;

public class Operador {
	//atributos
	
	//metodos
	public Fraccion multiplicarFraccion (Fraccion a, Fraccion b) {
		 
		return new Fraccion(a.getNumerador()*b.getNumerador(), a.getDenominador()*b.getDenominador());
	}

	public Fraccion dividirFraccion (Fraccion a, Fraccion b) {
		
		return new Fraccion(a.getNumerador()*b.getDenominador(), a.getDenominador()*b.getNumerador());
	}
	public void ImprimirFra (Fraccion a) {
		System.out.println("El resultado de la operación es:"+ a.getNumerador() + "/" + a.getDenominador());
		
	}
	public Fraccion cambiarSigno (int num, int den) {
		return new Fraccion (-num, den);
	}
}
