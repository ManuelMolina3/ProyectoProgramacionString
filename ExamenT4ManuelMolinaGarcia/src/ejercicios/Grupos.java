package ejercicios;

public class Grupos extends Entradas{
	private int numPersonas;

	public Grupos(int zona, int numAsiento, int numFila, int numPersonas) {
		super(zona, numAsiento, numFila);
		this.numPersonas = numPersonas;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	@Override
	public String toString() {
		return "Grupos [numPersonas=" + numPersonas + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPrecioEnt(double porcentajeIva, double precio1, double precio2, double porcentajeDes, double cantidadFija) {
		// TODO Auto-generated method stub
		if(numPersonas<=10)
		return super.calcularPrecioEnt(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija);
		else
		return super.calcularPrecioEnt(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija)-porcentajeDes;
	}
	
	
}
