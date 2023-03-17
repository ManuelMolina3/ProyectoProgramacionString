package ejercicio1;

public class Circulo {

	//atributos
	public double radio;
	//constructores
	public Circulo() {
		
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	//gettandsett
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	//toString
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	//comportamiento o método
	//detras del public va el tipo de devolución
	public double calcularArea (/*paramtros o argumentos*/) {
		double expo=2;
		double result=0.0;
		result=Math.PI*Math.pow(radio, expo);
		return result;
	}
	
}
