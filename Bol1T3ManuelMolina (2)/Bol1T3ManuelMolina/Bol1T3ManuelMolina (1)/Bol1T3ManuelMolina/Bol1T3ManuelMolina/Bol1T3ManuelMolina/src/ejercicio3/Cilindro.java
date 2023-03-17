package ejercicio3;

public class Cilindro {
	//atributos
	double radio;
	double altura;
	//constructores
	public Cilindro (double radio, double altura) {
		this.radio= radio;
		this.altura=altura;
		
	}
	//getterandsetter
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	//toString
	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
	}
	//metodo
	public double calcularvolumen () {
		double dos=2;
		double resultado=0.0;
		resultado= Math.pow(radio, dos) * altura;
		return resultado;
		
	}

	
}
