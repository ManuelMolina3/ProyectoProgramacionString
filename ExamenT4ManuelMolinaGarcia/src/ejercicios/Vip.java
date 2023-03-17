package ejercicios;

public class Vip extends Entradas{

	private String nombPersona;

	public Vip(int zona, int numAsiento, int numFila, String nombPersona) {
		super(zona, numAsiento, numFila);
		this.nombPersona = nombPersona;
	}

	public String getNombPersona() {
		return nombPersona;
	}

	public void setNombPerona(String nombPersona) {
		this.nombPersona = nombPersona;
	}

	@Override
	public String toString() {
		return "Vip [nombPersona=" + nombPersona + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPrecioEnt(double porcentajeIva, double precio1, double precio2, double porcentajeDes, double cantidadFija) {
		// TODO Auto-generated method stub
		return super.calcularPrecioEnt(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija)+cantidadFija;
	}
	public void ImprimirRegalo () {
		System.out.printf("Enhorabuena toma tu botella de champán y tu foto firmada %s", nombPersona);
	}
	
}
