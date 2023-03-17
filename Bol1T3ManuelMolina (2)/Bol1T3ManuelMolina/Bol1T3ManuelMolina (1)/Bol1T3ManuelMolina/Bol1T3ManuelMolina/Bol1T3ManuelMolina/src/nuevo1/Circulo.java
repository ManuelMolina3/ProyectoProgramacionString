package nuevo1;

public class Circulo {

	//atributos
	double radio;
	//constructores
	public Circulo() {
		
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	//comportamiento o método
	//detras del public va el tipo de devolución
	public double calcularArea (double r) {
		double expo=2;
		double result=0.0;
		result=Math.PI*Math.pow(r, expo);
		return result;
		
	}
}
