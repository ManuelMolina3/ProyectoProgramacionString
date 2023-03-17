package ejercicioClase;

public class Fraccion {
	//atributos
	private int numerador;
	private int denominador;
	//constructores
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		
	}

	public Fraccion() {
		
	}
	//ToString
	
	public String toString() {
		return "Racional [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
	//gettersandsetters

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
}
